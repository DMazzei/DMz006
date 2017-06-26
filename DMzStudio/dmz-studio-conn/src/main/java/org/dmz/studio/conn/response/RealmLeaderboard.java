package org.dmz.studio.conn.response;

import java.util.List;

import org.dmz.studio.conn.model.realmleaderboard.ChallengeMode;

public class RealmLeaderboard extends AbstractResponse {
    private List<ChallengeMode> challenge;

    public List<ChallengeMode> getChallenge() {
        return challenge;
    }

    public void setChallenge(List<ChallengeMode> challenge) {
        this.challenge = challenge;
    }
}
