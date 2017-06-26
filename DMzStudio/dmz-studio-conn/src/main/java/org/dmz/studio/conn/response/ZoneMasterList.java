package org.dmz.studio.conn.response;

import java.util.List;

public class ZoneMasterList extends AbstractResponse {
    private List<org.dmz.studio.conn.model.zone.Zone> zones;

    public List<org.dmz.studio.conn.model.zone.Zone> getZones() {
        return zones;
    }

    public void setZones(List<org.dmz.studio.conn.model.zone.Zone> zones) {
        this.zones = zones;
    }
}
