package org.dmz.studio.conn.model.characterprofile.item;

import java.util.List;

import org.dmz.studio.conn.model.characterprofile.item.properties.Appearance;
import org.dmz.studio.conn.model.characterprofile.item.properties.ArtifactTrait;
import org.dmz.studio.conn.model.characterprofile.item.properties.Relic;
import org.dmz.studio.conn.model.characterprofile.item.properties.Stat;
import org.dmz.studio.conn.model.characterprofile.item.properties.TooltipParams;
import org.dmz.studio.conn.model.characterprofile.item.properties.WeaponInfo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {
    private int id;
    private String name;
    private String icon;
    private int quality;
    private int itemLevel;
    private List<Stat> stats;
    private int armor;
    private String context;
    private List<Integer> bonusList;
    private int artifactId;
    private int displayInfoId;
    private int artifactAppearanceId;
    private List<ArtifactTrait> artifactTraits;
    private List<Relic> relics;
    private Appearance appearance;
    private TooltipParams tooltipParams;
    private WeaponInfo weaponInfo;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
    public int getQuality() {
        return quality;
    }
    public void setQuality(int quality) {
        this.quality = quality;
    }
    public int getItemLevel() {
        return itemLevel;
    }
    public void setItemLevel(int itemLevel) {
        this.itemLevel = itemLevel;
    }
    public List<Stat> getStats() {
        return stats;
    }
    public void setStats(List<Stat> stats) {
        this.stats = stats;
    }
    public int getArmor() {
        return armor;
    }
    public void setArmor(int armor) {
        this.armor = armor;
    }
    public String getContext() {
        return context;
    }
    public void setContext(String context) {
        this.context = context;
    }
    public List<Integer> getBonusList() {
        return bonusList;
    }
    public void setBonusList(List<Integer> bonusList) {
        this.bonusList = bonusList;
    }
    public int getArtifactId() {
        return artifactId;
    }
    public void setArtifactId(int artifactId) {
        this.artifactId = artifactId;
    }
    public int getDisplayInfoId() {
        return displayInfoId;
    }
    public void setDisplayInfoId(int displayInfoId) {
        this.displayInfoId = displayInfoId;
    }
    public int getArtifactAppearanceId() {
        return artifactAppearanceId;
    }
    public void setArtifactAppearanceId(int artifactAppearanceId) {
        this.artifactAppearanceId = artifactAppearanceId;
    }
    public List<ArtifactTrait> getArtifactTraits() {
        return artifactTraits;
    }
    public void setArtifactTraits(List<ArtifactTrait> artifactTraits) {
        this.artifactTraits = artifactTraits;
    }
    public List<Relic> getRelics() {
        return relics;
    }
    public void setRelics(List<Relic> relics) {
        this.relics = relics;
    }
    public Appearance getAppearance() {
        return appearance;
    }
    public void setAppearance(Appearance appearance) {
        this.appearance = appearance;
    }
    public TooltipParams getTooltipParams() {
        return tooltipParams;
    }
    public void setTooltipParams(TooltipParams tooltipParams) {
        this.tooltipParams = tooltipParams;
    }
    public WeaponInfo getWeaponInfo() {
        return weaponInfo;
    }
    public void setWeaponInfo(WeaponInfo weaponInfo) {
        this.weaponInfo = weaponInfo;
    }
}
