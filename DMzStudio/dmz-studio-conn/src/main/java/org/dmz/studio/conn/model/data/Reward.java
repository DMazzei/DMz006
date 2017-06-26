package org.dmz.studio.conn.model.data;

import org.dmz.studio.conn.model.achievement.Achievement;
import org.dmz.studio.conn.model.characterprofile.item.Item;

public class Reward {
    private int minGuildLevel;
    private int minGuildRepLevel;
    private Achievement achievement;
    private Item item;

    public int getMinGuildLevel() {
        return minGuildLevel;
    }

    public void setMinGuildLevel(int minGuildLevel) {
        this.minGuildLevel = minGuildLevel;
    }

    public int getMinGuildRepLevel() {
        return minGuildRepLevel;
    }

    public void setMinGuildRepLevel(int minGuildRepLevel) {
        this.minGuildRepLevel = minGuildRepLevel;
    }

    public Achievement getAchievement() {
        return achievement;
    }

    public void setAchievement(Achievement achievement) {
        this.achievement = achievement;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
