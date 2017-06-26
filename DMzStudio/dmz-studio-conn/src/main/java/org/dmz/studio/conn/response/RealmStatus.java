package org.dmz.studio.conn.response;

import java.util.List;

import org.dmz.studio.conn.model.realm.Realm;

public class RealmStatus extends AbstractResponse {
    private List<Realm> realms;

    public List<Realm> getRealms() {
        return realms;
    }

    public void setRealms(List<Realm> realms) {
        this.realms = realms;
    }
}
