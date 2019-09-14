package main;

import java.util.Arrays;
import java.util.Scanner;

//零钱兑换
public class Code41Coin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[] coins=new int[n];
        for (int i = 0; i < n; i++) {
            coins[i]=scanner.nextInt();
        }
        System.out.println(coinChange(coins,m));
    }

    public static int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length == 0)
            return -1;
        int[] dp = new int[amount + 1];
//        Arrays.fill(dp, amount + 1);
        for (int i = 0; i < amount+1; i++) {
            dp[i]=amount+1;
        }
        dp[0] = 0;
        for (int i = 1; i < amount + 1; i++) {
            for (int num : coins) {
                if (num <= i) dp[i] = Math.min(dp[i], dp[i - num] + 1);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
