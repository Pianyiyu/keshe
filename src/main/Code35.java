package main;


//选出不相邻的数字之和最大(动态规划)
public class Code35 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 1, 7, 8, 3};
        System.out.println(rec_maxsum(nums, 6));
        System.out.println(dp_maxsum(nums, 6));
    }
    //递归版本
    public static int rec_maxsum(int[] nums, int i) {
        if (i == 0) return nums[0];
        if (i == 1) return Math.max(nums[0], nums[1]);
        return Math.max(rec_maxsum(nums, i - 2) + nums[i], rec_maxsum(nums, i - 1));
    }

    //非递归
    public static int dp_maxsum(int[] nums, int i) {

        if (i == 0) return nums[0];
        if (i == 1) return Math.max(nums[0], nums[1]);
        int[] dp = new int[nums.length];
        for (int j = 0; j < nums.length; j++) {
            dp[i] = 0;
        }
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int j = 2; j <= i; j++) {
            dp[j] = Math.max(dp[j- 2] + nums[j], dp[j - 1]);
        }
        return dp[i];
    }
}
