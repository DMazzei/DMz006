package org.dmz.studio.conn.response.data;

import java.util.Map;

import org.dmz.studio.conn.model.data.Talent;
import org.dmz.studio.conn.response.AbstractResponse;

public class Talents extends AbstractResponse {
    private Map<String, Talent> talents;

    public Map<String, Talent> getTalents() {
        return talents;
    }

    public void setTalents(Map<String, Talent> talents) {
        this.talents = talents;
    }
}
