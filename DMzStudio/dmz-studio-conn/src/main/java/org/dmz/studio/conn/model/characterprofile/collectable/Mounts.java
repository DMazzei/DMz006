package org.dmz.studio.conn.model.characterprofile.collectable;

import java.util.List;

import org.dmz.studio.conn.model.characterprofile.Collectable;

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
