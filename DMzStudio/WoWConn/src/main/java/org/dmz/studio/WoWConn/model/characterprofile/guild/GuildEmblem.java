package org.dmz.studio.WoWConn.model.characterprofile.guild;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GuildEmblem {
    private int icon;
    private int iconColorId;
    private int border;
    private int borderColorId;
    private int backgroundColorId;
    private String iconColor;
    private String borderColor;
    private String backgroundColor;
    private GuildEmblem emblem;
}
