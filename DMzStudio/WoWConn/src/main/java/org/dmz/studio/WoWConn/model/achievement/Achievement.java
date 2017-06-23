package org.dmz.studio.WoWConn.model.achievement;

import org.dmz.studio.WoWConn.model.achievement.Criteria;
import org.dmz.studio.WoWConn.model.characterprofile.item.Item;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Achievement {
    private int id;
    private String title;
    private int points;
    private String description;
    private String reward;
    private String icon;
    private boolean accountWide;
    private int factionId;
    private List<Item> rewardItems;
    private List<Criteria> criteria;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public boolean isAccountWide() {
        return accountWide;
    }

    public void setAccountWide(boolean accountWide) {
        this.accountWide = accountWide;
    }

    public int getFactionId() {
        return factionId;
    }

    public void setFactionId(int factionId) {
        this.factionId = factionId;
    }

    public List<Item> getRewardItems() {
        return rewardItems;
    }

    public void setRewardItems(List<Item> rewardItems) {
        this.rewardItems = rewardItems;
    }

    public List<Criteria> getCriteria() {
        return criteria;
    }

    public void setCriteria(List<Criteria> criteria) {
        this.criteria = criteria;
    }
}
