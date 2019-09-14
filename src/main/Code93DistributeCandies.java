package main;

import java.util.HashSet;

public class Code93DistributeCandies {

    public int distributeCandies(int[] candies) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < candies.length; i++) {
            set.add(candies[i]);
        }
        int mid = candies.length / 2;
        if (set.size() > mid) {
            return mid;
        } else
            return set.size();
    }

}
