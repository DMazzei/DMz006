package org.dmz.studio.WoWConn.model.characterprofile.collectable;

import org.dmz.studio.WoWConn.model.characterprofile.Collectable;

import java.util.List;

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
