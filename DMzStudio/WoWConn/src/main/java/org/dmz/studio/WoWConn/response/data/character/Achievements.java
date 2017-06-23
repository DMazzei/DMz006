package org.dmz.studio.WoWConn.response.data.character;

import org.dmz.studio.WoWConn.model.data.AchievementCategory;
import org.dmz.studio.WoWConn.response.AbstractResponse;

import java.util.List;

public class Achievements extends AbstractResponse {
    private List<AchievementCategory> achievements;

    public List<AchievementCategory> getAchievements() {
        return achievements;
    }

    public void setAchievements(List<AchievementCategory> achievements) {
        this.achievements = achievements;
    }
}
