package org.dmz.studio.WoWConn.model.characterprofile;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Collectable {
    private int numCollected;
    private int numNotCollected;

    public int getNumCollected() {
        return numCollected;
    }

    public void setNumCollected(int numCollected) {
        this.numCollected = numCollected;
    }

    public int getNumNotCollected() {
        return numNotCollected;
    }

    public void setNumNotCollected(int numNotCollected) {
        this.numNotCollected = numNotCollected;
    }
}
