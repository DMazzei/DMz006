package org.dmz.studio.repository.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class AuctionIndexFiles {

    @Id
    public String id;
    
    public String realm;
    public List<AuctionFile> files;
    
    public AuctionIndexFiles() {}

    public AuctionIndexFiles(String realm, List<AuctionFile> files) {
        this.realm = realm;
        this.files = files;
    }
}
