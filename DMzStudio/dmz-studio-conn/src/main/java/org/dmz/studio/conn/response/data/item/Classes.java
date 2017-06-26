package org.dmz.studio.conn.response.data.item;

import java.util.List;

import org.dmz.studio.conn.response.AbstractResponse;

public class Classes extends AbstractResponse {
    private List<org.dmz.studio.conn.model.data.item.Classes> classes;

    public List<org.dmz.studio.conn.model.data.item.Classes> getClasses() {
        return classes;
    }

    public void setClasses(List<org.dmz.studio.conn.model.data.item.Classes> classes) {
        this.classes = classes;
    }
}
