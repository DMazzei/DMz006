package org.dmz.studio.conn.response;

import java.util.List;

import org.dmz.studio.conn.model.pet.Pet;

public class PetMasterList extends AbstractResponse {
    private List<Pet> pets;

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
