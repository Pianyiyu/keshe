package main;

import sun.misc.FpUtils;

public class Code103GetCommonString {

    public static void main(String[] args) {

        System.out.println(getCommonStrLength("abcd","bcdge"));
    }


//    dp[i][j] -- 表示以str1[i]和str2[j]为结尾的最长公共子串
//
//    当str1[i] == str2[j]时，dp[i][j] = dp[i-1][j-1] + 1;
//
//    否则，dp[i][j] = 0;
//
//    最优解为max(dp[i][j]),其中0<=i<len1, 0<=j<len2
    public static int getCommonStrLength(String s1,String s2){
        int[][] dp=new int[s1.length()+1][s2.length()+1];
        int max=0;
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j < s2.length(); j++) {
                if (s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    max=Math.max(max,dp[i][j]);
                }
            }
        }
        return max;
    }

}
