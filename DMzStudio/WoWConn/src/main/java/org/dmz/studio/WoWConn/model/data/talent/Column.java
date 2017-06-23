package org.dmz.studio.WoWConn.model.data.talent;

import org.dmz.studio.WoWConn.model.characterprofile.specialization.Talent;

import java.util.List;

public class Column {
    private List<Talent> talents;

    public List<Talent> getTalents() {
        return talents;
    }

    public void setTalents(List<Talent> talents) {
        this.talents = talents;
    }
}
