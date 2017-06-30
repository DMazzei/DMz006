package org.dmz.studio.auctionProcessor;

import org.dmz.studio.conn.response.Auction;
import org.dmz.studio.repository.model.AuctionIndexFiles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class AuctionProcessor implements ItemProcessor<Auction, AuctionIndexFiles> {
    
    private static final Logger log = LoggerFactory.getLogger(AuctionProcessor.class);

    @Override
    public AuctionIndexFiles process(Auction auctionDataDump) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

}
