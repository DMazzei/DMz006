package org.dmz.studio.conn.model.auction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AuctionDataDump {

    private String url;
    private Long lastModified;
    
    public String getUrl() {
        return url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    
    public Long getLastModified() {
        return lastModified;
    }
    
    public void setLastModified(Long lastModified) {
        this.lastModified = lastModified;
    } 
}
