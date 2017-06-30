package org.dmz.studio.conn.response;

import org.dmz.studio.conn.model.auction.AuctionIndex;

public class Auction extends AbstractResponse {
    private AuctionIndex auctionIndex;

    public AuctionIndex getAuctionIndex() {
        return auctionIndex;
    }

    public void setAuctionIndex(AuctionIndex auctionIndex) {
        this.auctionIndex = auctionIndex;
    }
}