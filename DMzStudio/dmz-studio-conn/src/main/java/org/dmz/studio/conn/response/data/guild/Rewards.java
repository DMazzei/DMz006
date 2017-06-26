package org.dmz.studio.conn.response.data.guild;

import java.util.List;

import org.dmz.studio.conn.model.data.Reward;
import org.dmz.studio.conn.response.AbstractResponse;

public class Rewards extends AbstractResponse {
    private List<Reward> rewards;

    public List<Reward> getRewards() {
        return rewards;
    }

    public void setRewards(List<Reward> rewards) {
        this.rewards = rewards;
    }
}
