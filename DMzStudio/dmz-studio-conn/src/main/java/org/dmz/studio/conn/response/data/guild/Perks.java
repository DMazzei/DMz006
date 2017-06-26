package org.dmz.studio.conn.response.data.guild;

import java.util.List;

import org.dmz.studio.conn.model.data.Perk;
import org.dmz.studio.conn.response.AbstractResponse;

public class Perks extends AbstractResponse {
    private List<Perk> perks;

    public List<Perk> getPerks() {
        return perks;
    }

    public void setPerks(List<Perk> perks) {
        this.perks = perks;
    }
}
