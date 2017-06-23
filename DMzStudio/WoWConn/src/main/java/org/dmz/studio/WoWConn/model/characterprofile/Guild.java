package org.dmz.studio.WoWConn.model.characterprofile;

import org.dmz.studio.WoWConn.model.characterprofile.guild.GuildEmblem;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Guild {
    private String name;
    private String realm;
    private String battlegroup;
    private int achievementPoints;
    private GuildEmblem emblem;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealm() {
        return realm;
    }

    public void setRealm(String realm) {
        this.realm = realm;
    }

    public String getBattlegroup() {
        return battlegroup;
    }

    public void setBattlegroup(String battlegroup) {
        this.battlegroup = battlegroup;
    }

    public int getAchievementPoints() {
        return achievementPoints;
    }

    public void setAchievementPoints(int achievementPoints) {
        this.achievementPoints = achievementPoints;
    }

    public GuildEmblem getEmblem() {
        return emblem;
    }

    public void setEmblem(GuildEmblem emblem) {
        this.emblem = emblem;
    }
}
