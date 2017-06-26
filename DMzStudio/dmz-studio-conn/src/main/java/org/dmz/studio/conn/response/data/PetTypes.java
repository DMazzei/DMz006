package org.dmz.studio.conn.response.data;

import java.util.List;

import org.dmz.studio.conn.model.data.PetType;
import org.dmz.studio.conn.response.AbstractResponse;

public class PetTypes extends AbstractResponse {
    private List<PetType> petTypes;

    public List<PetType> getPetTypes() {
        return petTypes;
    }

    public void setPetTypes(List<PetType> petTypes) {
        this.petTypes = petTypes;
    }
}
