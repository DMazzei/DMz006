package org.dmz.studio.WoWConn.response.data.character;

import org.dmz.studio.WoWConn.response.AbstractResponse;

public class Classes extends AbstractResponse {
    private org.dmz.studio.WoWConn.model.data.Classes classes;

    public org.dmz.studio.WoWConn.model.data.Classes getClasses() {
        return classes;
    }

    public void setClasses(org.dmz.studio.WoWConn.model.data.Classes classes) {
        this.classes = classes;
    }
}
