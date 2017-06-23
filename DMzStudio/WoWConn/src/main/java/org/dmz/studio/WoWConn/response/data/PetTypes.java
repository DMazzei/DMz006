package org.dmz.studio.WoWConn.response.data;

import org.dmz.studio.WoWConn.model.data.PetType;
import org.dmz.studio.WoWConn.response.AbstractResponse;

import java.util.List;

public class PetTypes extends AbstractResponse {
    private List<PetType> petTypes;

    public List<PetType> getPetTypes() {
        return petTypes;
    }

    public void setPetTypes(List<PetType> petTypes) {
        this.petTypes = petTypes;
    }
}
