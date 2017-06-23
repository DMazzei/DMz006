package org.dmz.studio.ui;

import org.dmz.studio.WoWConn.Connection;
import org.dmz.studio.WoWConn.Request;
import org.dmz.studio.WoWConn.builder.RequestBuilder;
import org.dmz.studio.WoWConn.constants.Locale;
import org.dmz.studio.WoWConn.constants.Region;
import org.dmz.studio.WoWConn.constants.RequestParams;
import org.dmz.studio.WoWConn.constants.RequestType;
import org.dmz.studio.WoWConn.response.AbstractResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UiApplication {

    private static final Logger log = LoggerFactory.getLogger(UiApplication.class);
    
    public static void main(String[] args) {
        
        SpringApplication.run(UiApplication.class, args);
    }
    
    @Bean
    public void run() throws Exception {
        
        Connection connection = Connection.getInstance("API Key", Region.US, Locale.EN_US);
        Request request = RequestBuilder.create()
            .setRequestType(RequestType.CHARACTER)
            .addRequiredParamValue(RequestParams.REALM, "zul'jin")
            .addRequiredParamValue(RequestParams.CHARACTER_NAME, "gothgull")
            .addOptionalParamValues("fields", "achievements,appearance,feed")
            .addOptionalParamValues("fields", "guild,hunterPets,items")
            .addOptionalParamValues("fields", "mounts,pets,petSlots")
            .addOptionalParamValues("fields", "professions,progression,pvp")
            .addOptionalParamValues("fields", "quests,reputation,statistics")
            .addOptionalParamValues("fields", "stats,talents,titles")
            .build();

        try {
            AbstractResponse abstractResponse = connection.getRequestData(request);
        } catch (Exception e) {
            log.info(e.toString());
        }
    }
}