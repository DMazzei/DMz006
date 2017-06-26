package org.dmz.studio.conn.model.characterprofile.collectable;

import java.util.List;

import org.dmz.studio.conn.model.characterprofile.Collectable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BattlePets extends Collectable {
    private List<BattlePet> collected;

    public List<BattlePet> getCollected() {
        return collected;
    }

    public void setCollected(List<BattlePet> collected) {
        this.collected = collected;
    }
}
