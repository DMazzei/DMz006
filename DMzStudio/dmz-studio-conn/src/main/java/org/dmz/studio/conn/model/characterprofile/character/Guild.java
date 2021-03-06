package org.dmz.studio.conn.model.characterprofile.character;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Guild extends org.dmz.studio.conn.model.characterprofile.Guild {
    private int members;

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }
}
