package org.dmz.studio.WoWConn.response;

import org.dmz.studio.WoWConn.model.pvp.ArenaPlayer;

import java.util.List;

public class Leaderboard extends AbstractResponse {
    private List<ArenaPlayer> rows;

    public List<ArenaPlayer> getRows() {
        return rows;
    }

    public void setRows(List<ArenaPlayer> rows) {
        this.rows = rows;
    }
}