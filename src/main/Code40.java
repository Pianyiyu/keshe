package main;


//完全平方和 的个数最小

public class Code40 {

    public static void main(String[] args) {
        System.out.println(numSquares(13));
        System.out.println(numSquares(14));
        System.out.println(numSquares(15));
        System.out.println(numSquares(16));
    }


    public static int numSquares(int n) {

        int length = (int) Math.sqrt(n);
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = (i + 1) * (i + 1);
        }

        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i]=i;
            for (int j = 0; j < length; j++) {
                if (i<arr[j])break;
                else dp[i]=Math.min(dp[i],dp[i-arr[j]]+1);
            }
        }
        return dp[n];
    }
}
