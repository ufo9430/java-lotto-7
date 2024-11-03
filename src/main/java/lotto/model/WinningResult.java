package lotto.model;

import java.util.HashMap;

public class WinningResult {
    private final HashMap<Reward, Integer> rankCount = new HashMap<>();

    public void put(int rank) {
        Reward reward = Reward.getReward(rank);
        rankCount.put(reward, rankCount.getOrDefault(reward,0)+1);
    }

    public HashMap<Reward, Integer> getRankCount() {
        return rankCount;
    }
}
