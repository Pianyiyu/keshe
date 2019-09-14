package main;

//数组存在几个数之和为 一个指定的值
public class Code36 {


    public static void main(String[] args) {
        int[] nums={3,34,4,12,5,2};
        System.out.println(rec_subset(nums,5,13));
        System.out.println(dp_subset(nums,13));
    }

//递归版
    public static boolean rec_subset(int[] nums,int i,int s){
        if (s==0) return true;
        if (i==0)return nums[i]==s;
        if (nums[i]>s)return rec_subset(nums,i-1,s);
        return rec_subset(nums,i-1,s-nums[i])||rec_subset(nums,i-1,s);
    }
//非递归版
    public static boolean dp_subset(int[] nums,int s){
        boolean[][] dp=new boolean[nums.length][s+1];
        for (int i = 0; i < nums.length; i++) {
            dp[i][0]=true;
        }
        for (int i = 0; i < s + 1; i++) {
            if (i==nums[0]){
                dp[0][i]=true;
            }else
                dp[0][i]=false;
        }

        for (int i = 1; i < nums.length; i++) {
            for (int j = 1; j < s + 1; j++) {
                    if (nums[i]>j){
                    dp[i][j]=dp[i-1][j];
                    continue;
                }else {
                    dp[i][j]=dp[i-1][j]||dp[i-1][j-nums[i]];
                }
            }
        }

        return dp[nums.length-1][s];

    }

}
