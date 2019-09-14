package Exersise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int[] coins = {1, 5, 10, 20, 50, 100};
        System.out.println(dp_zu(coins,s));
        System.out.println(dp_zu_(coins,s));


        //List<List<Integer>> result = new ArrayList<>();
        //List<Integer> temp = new ArrayList<>();
        //zuhe(coins, result, 0, temp, s);

    }
//
//    public static void zuhe(int[] arr, List<List<Integer>> arrayList, int index, List<Integer> temp, int money) {
//        if (money < 0) return;
//        if (money == 0) {
//            arrayList.add(new ArrayList<>(temp));
//            return;
//        }
//        for (int i = index; i < arr.length; i++) {
//            temp.add(arr[i]);
//            zuhe(arr, arrayList, index, temp, money - arr[i]);
//            if (!temp.isEmpty())
//                temp.remove(temp.size() - 1);
//        }
//    }

     public static int dp_zu(int[] arr,int money){
        int[][] dp=new int[arr.length][money+1];
         for (int i = 0; i < dp.length; i++) {
             dp[i][0]=0;
         }
         for (int i = 0; i < dp[0].length; i++) {
             dp[0][i]=1;
         }
         for (int i = 1; i < arr.length; i++) {
             for (int j = 1; j < money+1; j++) {
                 if (j>=arr[i])
                     dp[i][j]=Math.max(dp[i-1][j-arr[i]]+1,dp[i-1][j]);
                 else dp[i][j]=dp[i-1][j];
             }
         }
         return dp[arr.length-1][money];
     }

    public static long dp_zu_(int[] arr,int money){
        long[] dp=new long[money+1];
        dp[0]=1;
        for (int i = 0; i < 6; i++)
        {
            for (int j = 1; j <= money; j++)
            {
                if (j >= arr[i])
                    dp[j] = dp[j] + dp[j-arr[i]];   //j值取和不取两种情况组合数目之和
            }
        }
        return dp[money];
    }


}
