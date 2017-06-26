package org.dmz.studio.conn.model.realmleaderboard.group;

import java.util.List;

import org.dmz.studio.conn.model.realmleaderboard.group.Member;
import org.dmz.studio.conn.model.realmleaderboard.time.Criteria;

public class Group {
    private int ranking;
    private Criteria time;
    private String date;
    private String faction;
    private boolean isRecurring;
    private List<Member> members;

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public Criteria getTime() {
        return time;
    }

    public void setTime(Criteria time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public boolean isRecurring() {
        return isRecurring;
    }

    public void setRecurring(boolean recurring) {
        isRecurring = recurring;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
