package org.dmz.studio.conn.model.data;

import java.util.List;

import org.dmz.studio.conn.model.characterprofile.specialization.Spec;
import org.dmz.studio.conn.model.data.talent.Tree;

public class Talent {
    private String className;
    private List<Spec> specs;
    private List<Tree> talents;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Spec> getSpecs() {
        return specs;
    }

    public void setSpecs(List<Spec> specs) {
        this.specs = specs;
    }

    public List<Tree> getTalents() {
        return talents;
    }

    public void setTalents(List<Tree> talents) {
        this.talents = talents;
    }
}
