package org.dmz.studio.conn.model.characterprofile.guild;

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
    
    public int getIcon() {
        return icon;
    }
    public void setIcon(int icon) {
        this.icon = icon;
    }
    public int getIconColorId() {
        return iconColorId;
    }
    public void setIconColorId(int iconColorId) {
        this.iconColorId = iconColorId;
    }
    public int getBorder() {
        return border;
    }
    public void setBorder(int border) {
        this.border = border;
    }
    public int getBorderColorId() {
        return borderColorId;
    }
    public void setBorderColorId(int borderColorId) {
        this.borderColorId = borderColorId;
    }
    public int getBackgroundColorId() {
        return backgroundColorId;
    }
    public void setBackgroundColorId(int backgroundColorId) {
        this.backgroundColorId = backgroundColorId;
    }
    public String getIconColor() {
        return iconColor;
    }
    public void setIconColor(String iconColor) {
        this.iconColor = iconColor;
    }
    public String getBorderColor() {
        return borderColor;
    }
    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }
    public String getBackgroundColor() {
        return backgroundColor;
    }
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
    public GuildEmblem getEmblem() {
        return emblem;
    }
    public void setEmblem(GuildEmblem emblem) {
        this.emblem = emblem;
    }
}
