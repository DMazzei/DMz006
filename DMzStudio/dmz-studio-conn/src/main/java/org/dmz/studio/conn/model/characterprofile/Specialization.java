package org.dmz.studio.conn.model.characterprofile;

import java.util.List;

import org.dmz.studio.conn.model.characterprofile.specialization.Spec;
import org.dmz.studio.conn.model.characterprofile.specialization.Talent;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Specialization {
    private boolean selected;
    private List<Talent> talents;
    private Spec spec;
    private String calcTalent;
    private String calcSpec;

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public List<Talent> getTalents() {
        return talents;
    }

    public void setTalents(List<Talent> talents) {
        this.talents = talents;
    }

    public Spec getSpec() {
        return spec;
    }

    public void setSpec(Spec spec) {
        this.spec = spec;
    }

    public String getCalcTalent() {
        return calcTalent;
    }

    public void setCalcTalent(String calcTalent) {
        this.calcTalent = calcTalent;
    }

    public String getCalcSpec() {
        return calcSpec;
    }

    public void setCalcSpec(String calcSpec) {
        this.calcSpec = calcSpec;
    }
}
