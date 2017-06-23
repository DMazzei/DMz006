package org.dmz.studio.WoWConn.model.characterprofile;

import org.dmz.studio.WoWConn.model.characterprofile.profession.Profession;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Professions {
    private List<Profession> primary;
    private List<Profession> secondary;

    public List<Profession> getPrimary() {
        return primary;
    }

    public void setPrimary(List<Profession> primary) {
        this.primary = primary;
    }

    public List<Profession> getSecondary() {
        return secondary;
    }

    public void setSecondary(List<Profession> secondary) {
        this.secondary = secondary;
    }
}
