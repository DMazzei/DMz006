package org.dmz.studio.WoWConn.model.realmleaderboard.realm;

import java.util.List;

public class Realm {
    private List<String> connectedRealms;

    private String name;
    private String slug;
    private String battlegroup;
    private String locale;
    private String timezone;

    public List<String> getConnectedRealms() {
        return connectedRealms;
    }

    public void setConnectedRealms(List<String> connectedRealms) {
        this.connectedRealms = connectedRealms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getBattlegroup() {
        return battlegroup;
    }

    public void setBattlegroup(String battlegroup) {
        this.battlegroup = battlegroup;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
}
