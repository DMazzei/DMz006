package org.dmz.studio.conn.response;

public class Achievement extends AbstractResponse {
    private org.dmz.studio.conn.model.achievement.Achievement achievement;

    public org.dmz.studio.conn.model.achievement.Achievement getAchievement() {
        return achievement;
    }

    public void setAchievement(org.dmz.studio.conn.model.achievement.Achievement achievement) {
        this.achievement = achievement;
    }
}
