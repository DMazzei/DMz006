package org.dmz.studio.scheduledTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import org.dmz.studio.conn.Connection;
import org.dmz.studio.conn.Request;
import org.dmz.studio.conn.builder.RequestBuilder;
import org.dmz.studio.conn.constants.Locale;
import org.dmz.studio.conn.constants.Region;
import org.dmz.studio.conn.constants.RequestParams;
import org.dmz.studio.conn.constants.RequestType;
import org.dmz.studio.conn.model.auction.AuctionDataDump;
import org.dmz.studio.conn.model.auction.AuctionIndex;
import org.dmz.studio.conn.response.Auction;
import org.dmz.studio.repository.AuctionIndexFilesRepository;
import org.dmz.studio.repository.RepositoryConfiguration;
import org.dmz.studio.repository.model.AuctionFile;
import org.dmz.studio.repository.model.AuctionIndexFiles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Import(RepositoryConfiguration.class)
public class ScheduledAuctionTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledAuctionTasks.class);
    
    @Autowired
    private AuctionIndexFilesRepository repository;

    // runs every 5 minutes
    @Scheduled(fixedRate = 300000)
    public void checkForAuctionDump() throws Exception {

        Auction auction;
        final String realmName = "zul'jin";
        
        Connection connection = Connection.getInstance("a98s92ax3z2gpacag66f2eh252pduce6", Region.US, Locale.EN_US);
        Request request = RequestBuilder.create()
            .setRequestType(RequestType.AUCTION)
            .addRequiredParamValue(RequestParams.REALM, realmName)
            .build();

        try {
            auction = connection.getRequestData(request);
            
            for (AuctionDataDump auctionData : auction.getAuctionIndex().getFiles()) {
                
                AuctionIndexFiles indexFile = repository.findByRealm(realmName);
                if (indexFile == null) {
                    
                    indexFile = externalToDatabase.apply(auction.getAuctionIndex());
                    indexFile.realm = realmName;
                    repository.insert(indexFile);
                } 
                else {

                    AuctionFile file = indexFile
                                        .files
                                        .stream()
                                        .filter(a -> a.lastModified == auctionData.getLastModified())
                                        .findFirst()
                                        .orElse(null);
                    if (file == null) {
                        file = new AuctionFile(
                                    auctionData.getUrl(),
                                    auctionData.getLastModified(),
                                    false);
                        indexFile.files.add(file);
                        repository.save(indexFile);
                    }
                }
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }
    
    Function<AuctionIndex, AuctionIndexFiles> externalToDatabase
        = new Function<AuctionIndex, AuctionIndexFiles>() {

        public AuctionIndexFiles apply(AuctionIndex t) {
            AuctionIndexFiles auctionIndexFiles = new AuctionIndexFiles();
            List<AuctionFile> files = new ArrayList<AuctionFile>();
            
            for (AuctionDataDump dataDump : t.getFiles()) {
                AuctionFile file = new AuctionFile();
                file.url = dataDump.getUrl();
                file.lastModified = dataDump.getLastModified();
                files.add(file);
            }
                
            return auctionIndexFiles;
        }
    };
}
