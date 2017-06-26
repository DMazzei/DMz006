package org.dmz.studio.conn.model.characterprofile.item.properties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TooltipParams {
    private int transmogItem;
    private int timewalkerLevel;
    private int enchant;
    private int gem0;
    private int gem1;
    private int gem2;
    
    public int getTransmogItem() {
        return transmogItem;
    }
    public void setTransmogItem(int transmogItem) {
        this.transmogItem = transmogItem;
    }
    public int getTimewalkerLevel() {
        return timewalkerLevel;
    }
    public void setTimewalkerLevel(int timewalkerLevel) {
        this.timewalkerLevel = timewalkerLevel;
    }
    public int getEnchant() {
        return enchant;
    }
    public void setEnchant(int enchant) {
        this.enchant = enchant;
    }
    public int getGem0() {
        return gem0;
    }
    public void setGem0(int gem0) {
        this.gem0 = gem0;
    }
    public int getGem1() {
        return gem1;
    }
    public void setGem1(int gem1) {
        this.gem1 = gem1;
    }
    public int getGem2() {
        return gem2;
    }
    public void setGem2(int gem2) {
        this.gem2 = gem2;
    }
}
