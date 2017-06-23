package org.dmz.studio.WoWConn.model.characterprofile.collectable;

import org.dmz.studio.WoWConn.model.characterprofile.Collectable;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Mounts extends Collectable {
    private List<Mount> collected;

    public List<Mount> getCollected() {
        return collected;
    }

    public void setCollected(List<Mount> collected) {
        this.collected = collected;
    }
}
