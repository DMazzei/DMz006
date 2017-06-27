package org.dmz.studio.ui;

import java.util.stream.Collectors;

import org.dmz.studio.conn.Connection;
import org.dmz.studio.conn.Request;
import org.dmz.studio.conn.builder.RequestBuilder;
import org.dmz.studio.conn.constants.Locale;
import org.dmz.studio.conn.constants.Region;
import org.dmz.studio.conn.constants.RequestParams;
import org.dmz.studio.conn.constants.RequestType;
import org.dmz.studio.conn.response.AbstractResponse;
import org.dmz.studio.conn.response.CharacterProfile;
import org.dmz.studio.repository.Dataset;
import org.dmz.studio.repository.DatasetRepository;
import org.dmz.studio.repository.RepositoryConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(RepositoryConfiguration.class)
public class UiApplication {

    private static final Logger log = LoggerFactory.getLogger(UiApplication.class);
    
    @Autowired
    private DatasetRepository repository;
    
    public static void main(String[] args) {
        
        SpringApplication.run(UiApplication.class, args);
    }
    
    @Bean
    public CommandLineRunner run() throws Exception {
        
        Dataset queryDataset = repository.findByApiMethod("CHARACTER");
        String fields = "";
        
        if(queryDataset != null && queryDataset.fields != null){
            fields = queryDataset.fields.stream().map(e -> e.name).collect(Collectors.joining(","));
        }
                
        Connection connection = Connection.getInstance("a98s92ax3z2gpacag66f2eh252pduce6", Region.US, Locale.EN_US);
        Request request = RequestBuilder.create()
            .setRequestType(RequestType.CHARACTER)
            .addRequiredParamValue(RequestParams.REALM, "zul'jin")
            .addRequiredParamValue(RequestParams.CHARACTER_NAME, "gothgull")
            .addOptionalParamValues("fields", fields)
            .build();

        return args -> {
            try {
                CharacterProfile responseCharacter = connection.getRequestData(request);
                log.info(responseCharacter.getName());
            } catch (Exception e) {
                log.info(e.toString());
            }
        };
    }
}
