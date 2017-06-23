package org.dmz.studio.WoWConn.response.data;

import org.dmz.studio.WoWConn.model.data.Battlegroup;
import org.dmz.studio.WoWConn.response.AbstractResponse;

import java.util.List;

public class Battlegroups extends AbstractResponse {
    private List<Battlegroup> battlegroups;

    public List<Battlegroup> getBattlegroups() {
        return battlegroups;
    }

    public void setBattlegroups(List<Battlegroup> battlegroups) {
        this.battlegroups = battlegroups;
    }
}
