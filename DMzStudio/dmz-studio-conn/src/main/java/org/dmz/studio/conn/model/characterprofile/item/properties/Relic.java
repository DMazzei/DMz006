package org.dmz.studio.conn.model.characterprofile.item.properties;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Relic {
    private int socket;
    private int itemId;
    private int context;
    private List<Integer> bonusList;

    public int getSocket() {
        return socket;
    }

    public void setSocket(int socket) {
        this.socket = socket;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getContext() {
        return context;
    }

    public void setContext(int context) {
        this.context = context;
    }

    public List<Integer> getBonusList() {
        return bonusList;
    }

    public void setBonusList(List<Integer> bonusList) {
        this.bonusList = bonusList;
    }
}
