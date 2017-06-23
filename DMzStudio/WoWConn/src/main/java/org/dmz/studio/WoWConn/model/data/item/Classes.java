package org.dmz.studio.WoWConn.model.data.item;

import java.util.List;

public class Classes {
    private int classId;
    private String name;
    private List<SubClass> subclasses;

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SubClass> getSubclasses() {
        return subclasses;
    }

    public void setSubclasses(List<SubClass> subclasses) {
        this.subclasses = subclasses;
    }
}
