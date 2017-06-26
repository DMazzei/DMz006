package org.dmz.studio.conn.response.data.character;

import java.util.List;

import org.dmz.studio.conn.model.data.AchievementCategory;
import org.dmz.studio.conn.response.AbstractResponse;

public class Achievements extends AbstractResponse {
    private List<AchievementCategory> achievements;

    public List<AchievementCategory> getAchievements() {
        return achievements;
    }

    public void setAchievements(List<AchievementCategory> achievements) {
        this.achievements = achievements;
    }
}
