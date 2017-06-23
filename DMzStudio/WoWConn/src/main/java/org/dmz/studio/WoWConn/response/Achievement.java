package org.dmz.studio.WoWConn.response;

public class Achievement extends AbstractResponse {
    private org.dmz.studio.WoWConn.model.achievement.Achievement achievement;

    public org.dmz.studio.WoWConn.model.achievement.Achievement getAchievement() {
        return achievement;
    }

    public void setAchievement(org.dmz.studio.WoWConn.model.achievement.Achievement achievement) {
        this.achievement = achievement;
    }
}
