package org.dmz.studio.WoWConn.response;

import java.util.List;

public class BossMasterList extends AbstractResponse {
    private List<Boss> bosses;

    public List<Boss> getBosses() {
        return bosses;
    }

    public void setBosses(List<Boss> bosses) {
        this.bosses = bosses;
    }
}