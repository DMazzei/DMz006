package org.dmz.studio.conn.model.data;

import org.dmz.studio.conn.model.characterprofile.specialization.Spell;

public class Perk {
    private int guildLevel;
    private Spell spell;

    public int getGuildLevel() {
        return guildLevel;
    }

    public void setGuildLevel(int guildLevel) {
        this.guildLevel = guildLevel;
    }

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }
}
