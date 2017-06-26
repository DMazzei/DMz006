package org.dmz.studio.conn.response.data.character;

import org.dmz.studio.conn.response.AbstractResponse;

public class Classes extends AbstractResponse {
    private org.dmz.studio.conn.model.data.Classes classes;

    public org.dmz.studio.conn.model.data.Classes getClasses() {
        return classes;
    }

    public void setClasses(org.dmz.studio.conn.model.data.Classes classes) {
        this.classes = classes;
    }
}
