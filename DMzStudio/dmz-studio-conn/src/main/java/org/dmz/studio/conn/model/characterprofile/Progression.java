package org.dmz.studio.conn.model.characterprofile;

import java.util.List;

import org.dmz.studio.conn.model.characterprofile.raid.Raid;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Progression {
    private List<Raid> raids;

    public List<Raid> getRaids() {
        return raids;
    }

    public void setRaids(List<Raid> raids) {
        this.raids = raids;
    }
}
