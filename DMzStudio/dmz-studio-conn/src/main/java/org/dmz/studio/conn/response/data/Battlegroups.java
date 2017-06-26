package org.dmz.studio.conn.response.data;

import java.util.List;

import org.dmz.studio.conn.model.data.Battlegroup;
import org.dmz.studio.conn.response.AbstractResponse;

public class Battlegroups extends AbstractResponse {
    private List<Battlegroup> battlegroups;

    public List<Battlegroup> getBattlegroups() {
        return battlegroups;
    }

    public void setBattlegroups(List<Battlegroup> battlegroups) {
        this.battlegroups = battlegroups;
    }
}
