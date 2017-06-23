package org.dmz.studio.WoWConn.response.data.guild;

import org.dmz.studio.WoWConn.model.data.Reward;
import org.dmz.studio.WoWConn.response.AbstractResponse;

import java.util.List;

public class Rewards extends AbstractResponse {
    private List<Reward> rewards;

    public List<Reward> getRewards() {
        return rewards;
    }

    public void setRewards(List<Reward> rewards) {
        this.rewards = rewards;
    }
}
