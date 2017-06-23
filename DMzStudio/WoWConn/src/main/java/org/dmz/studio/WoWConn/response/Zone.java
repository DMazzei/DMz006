package org.dmz.studio.WoWConn.response;

public class Zone extends AbstractResponse {
    private org.dmz.studio.WoWConn.model.zone.Zone zone;

    public org.dmz.studio.WoWConn.model.zone.Zone getZone() {
        return zone;
    }

    public void setZone(org.dmz.studio.WoWConn.model.zone.Zone zone) {
        this.zone = zone;
    }
}
