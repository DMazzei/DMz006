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
}
