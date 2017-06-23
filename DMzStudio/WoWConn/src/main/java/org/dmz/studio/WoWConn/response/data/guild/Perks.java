package org.dmz.studio.WoWConn.response.data.guild;

import org.dmz.studio.WoWConn.model.data.Perk;
import org.dmz.studio.WoWConn.response.AbstractResponse;

import java.util.List;

public class Perks extends AbstractResponse {
    private List<Perk> perks;

    public List<Perk> getPerks() {
        return perks;
    }

    public void setPerks(List<Perk> perks) {
        this.perks = perks;
    }
}
