package org.dmz.studio.conn.response;

public class Zone extends AbstractResponse {
    private org.dmz.studio.conn.model.zone.Zone zone;

    public org.dmz.studio.conn.model.zone.Zone getZone() {
        return zone;
    }

    public void setZone(org.dmz.studio.conn.model.zone.Zone zone) {
        this.zone = zone;
    }
}
