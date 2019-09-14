package shunfeng;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
//        AbstractQueuedSynchronizer
        System.out.println(solve(arr));
    }
    public static int solve(int[] arr){
        if (arr.length == 0)
            return 0;
        int[] dp =new int[arr.length+1];
        dp[0] = 1;
        int max = 1;
        for (int i = 1; i < arr.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}
