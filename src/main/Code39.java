package main;


public class Code39 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbd"));
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("abcda"));
        System.out.println(longestPalindrome("aaabaaaa"));
    }

    public static String longestPalindrome(String s) {
        if (s.isEmpty()) return "";
        int maxlength = 1;
        int start = 0;
        char[] string = s.toCharArray();
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                if (i- j < 2) {
                    dp[j][i] = (string[i] == string[j]);
                    //dp[i][j] = dp[j][i];
                } else {
                    dp[j][i] = (string[i] == string[j] && dp[j + 1][i - 1]);
                    //dp[i][j] = dp[j][i];
                }
                if (maxlength < i - j + 1 && dp[j][i]) {
                    maxlength = i - j + 1;
                    start = j;
                }
            }
        }
        return s.substring(start, start + maxlength);
    }
}
