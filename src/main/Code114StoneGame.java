package main;

//亚历克斯和李用几堆石子在做游戏。偶数堆石子排成一行，每堆都有正整数颗石子 piles[i] 。
//
//        游戏以谁手中的石子最多来决出胜负。石子的总数是奇数，所以没有平局。
//
//        亚历克斯和李轮流进行，亚历克斯先开始。 每回合，玩家从行的开始或结束处取走整堆石头。 这种情况一直持续到没有更多的石子堆为止，此时手中石子最多的玩家获胜。
//
//        假设亚历克斯和李都发挥出最佳水平，当亚历克斯赢得比赛时返回 true ，当李赢得比赛时返回 false 。
//
//
//
//        示例：
//
//        输入：[5,3,4,5]
//        输出：true
//        解释：
//        亚历克斯先开始，只能拿前 5 颗或后 5 颗石子 。
//        假设他取了前 5 颗，这一行就变成了 [3,4,5] 。
//        如果李拿走前 3 颗，那么剩下的是 [4,5]，亚历克斯拿走后 5 颗赢得 10 分。
//        如果李拿走后 5 颗，那么剩下的是 [3,4]，亚历克斯拿走后 4 颗赢得 9 分。
//        这表明，取前 5 颗石子对亚历克斯来说是一个胜利的举动，所以我们返回 true 。

import java.util.concurrent.Future;

public class Code114StoneGame {

    public boolean stoneGame(int[] piles) {
        //dp其实就是存储了递归过程中的数值
        //dps[i][j]代表从i到j所能获得的最大的绝对分数
        //（比如为1就说明亚历克斯从i到j可以赢李1分）
        //如何计算dps[i][j]呢:max(piles[i]-dp[i+1][j],piles[j]-dp[i][j-1]);
        //这里减去dps数组是因为李也要找到最大的
        //最后dps=[5 2 4 1]
        //        [0 3 1 4]
        //        [0 0 4 1]
        //        [0 0 0 5]
        int[][] dp = new int[piles.length][piles.length];
        for (int i = 0; i < piles.length; i++)
            dp[i][i] = piles[i];
        for (int i = 1; i < piles.length; i++)
            for (int j = i - 1; j >= 0; j--)
                //以ABC为例，可以拿A，剩余BC，后手会选择BC的最佳拿取方式，
                //                  拿第j个                拿第i个
                dp[j][i] = Math.max(piles[j] - dp[j+1][i], piles[i] - dp[j][i-1]);
        return dp[0][piles.length-1] >= 0;
    }


}
