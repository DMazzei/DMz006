package org.dmz.studio.WoWConn.response;

import org.dmz.studio.WoWConn.model.realmleaderboard.ChallengeMode;

import java.util.List;

public class RealmLeaderboard extends AbstractResponse {
    private List<ChallengeMode> challenge;

    public List<ChallengeMode> getChallenge() {
        return challenge;
    }

    public void setChallenge(List<ChallengeMode> challenge) {
        this.challenge = challenge;
    }
}
