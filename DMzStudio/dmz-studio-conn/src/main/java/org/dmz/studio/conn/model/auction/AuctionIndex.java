package org.dmz.studio.conn.model.auction;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AuctionIndex {

    private List<AuctionDataDump> files;

    public List<AuctionDataDump> getFiles() {
        return files;
    }

    public void setFiles(List<AuctionDataDump> files) {
        this.files = files;
    }
}
