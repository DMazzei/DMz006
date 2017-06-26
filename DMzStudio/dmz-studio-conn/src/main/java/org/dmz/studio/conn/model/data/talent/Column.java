package org.dmz.studio.conn.model.data.talent;

import java.util.List;

import org.dmz.studio.conn.model.characterprofile.specialization.Talent;

public class Column {
    private List<Talent> talents;

    public List<Talent> getTalents() {
        return talents;
    }

    public void setTalents(List<Talent> talents) {
        this.talents = talents;
    }
}
