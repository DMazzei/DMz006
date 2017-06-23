package org.dmz.studio.WoWConn.response.data;

import org.dmz.studio.WoWConn.model.data.Talent;
import org.dmz.studio.WoWConn.response.AbstractResponse;

import java.util.Map;

public class Talents extends AbstractResponse {
    private Map<String, Talent> talents;

    public Map<String, Talent> getTalents() {
        return talents;
    }

    public void setTalents(Map<String, Talent> talents) {
        this.talents = talents;
    }
}
