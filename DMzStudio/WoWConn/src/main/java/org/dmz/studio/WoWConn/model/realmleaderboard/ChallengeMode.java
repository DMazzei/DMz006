package org.dmz.studio.WoWConn.model.realmleaderboard;

import org.dmz.studio.WoWConn.model.realmleaderboard.group.Group;
import org.dmz.studio.WoWConn.model.realmleaderboard.map.Map;
import org.dmz.studio.WoWConn.model.realmleaderboard.realm.Realm;

import java.util.List;

public class ChallengeMode {
    private Realm realm;
    private Map map;
    private List<Group> groups;

    public Realm getRealm() {
        return realm;
    }

    public void setRealm(Realm realm) {
        this.realm = realm;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}
