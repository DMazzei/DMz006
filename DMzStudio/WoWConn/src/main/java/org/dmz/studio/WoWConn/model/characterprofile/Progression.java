package org.dmz.studio.WoWConn.model.characterprofile;

import org.dmz.studio.WoWConn.model.characterprofile.raid.Raid;
import java.util.List;
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
