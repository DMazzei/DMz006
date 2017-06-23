package org.dmz.studio.WoWConn.response.data.item;

import org.dmz.studio.WoWConn.response.AbstractResponse;

import java.util.List;

public class Classes extends AbstractResponse {
    private List<org.dmz.studio.WoWConn.model.data.item.Classes> classes;

    public List<org.dmz.studio.WoWConn.model.data.item.Classes> getClasses() {
        return classes;
    }

    public void setClasses(List<org.dmz.studio.WoWConn.model.data.item.Classes> classes) {
        this.classes = classes;
    }
}
