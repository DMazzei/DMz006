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
}
