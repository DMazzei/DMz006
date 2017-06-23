package org.dmz.studio.WoWConn.model.realmleaderboard.group;

import org.dmz.studio.WoWConn.model.characterprofile.specialization.Spec;

public class Member {
    private Character character;
    private Spec spec;

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Spec getSpec() {
        return spec;
    }

    public void setSpec(Spec spec) {
        this.spec = spec;
    }
}
