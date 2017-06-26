package org.dmz.studio.conn.response;

import java.util.List;

import org.dmz.studio.conn.model.pvp.ArenaPlayer;

public class Leaderboard extends AbstractResponse {
    private List<ArenaPlayer> rows;

    public List<ArenaPlayer> getRows() {
        return rows;
    }

    public void setRows(List<ArenaPlayer> rows) {
        this.rows = rows;
    }
}