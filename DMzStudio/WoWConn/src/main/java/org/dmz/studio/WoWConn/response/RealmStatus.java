package org.dmz.studio.WoWConn.response;

import org.dmz.studio.WoWConn.model.realm.Realm;

import java.util.List;

public class RealmStatus extends AbstractResponse {
    private List<Realm> realms;

    public List<Realm> getRealms() {
        return realms;
    }

    public void setRealms(List<Realm> realms) {
        this.realms = realms;
    }
}
