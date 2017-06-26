package org.dmz.studio.conn.model.data;

import java.util.List;

import org.dmz.studio.conn.model.achievement.Achievement;

public class AchievementCategory {
    private int id;
    private List<Achievement> achievements;
    private List<AchievementCategory> categories;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Achievement> getAchievements() {
        return achievements;
    }

    public void setAchievements(List<Achievement> achievements) {
        this.achievements = achievements;
    }

    public List<AchievementCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<AchievementCategory> categories) {
        this.categories = categories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
