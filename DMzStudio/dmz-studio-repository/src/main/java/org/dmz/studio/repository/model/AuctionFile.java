package org.dmz.studio.repository.model;


public class AuctionFile {

    public String url;
    public Long lastModified;
    public Boolean consumed;
    
    public AuctionFile() {}

    public AuctionFile(String url, Long lastModified, Boolean consumed) {

        this.url = url;
        this.lastModified = lastModified;
        this.consumed = consumed;
    }
}
