package KuaiShou;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1=in.nextLine();
        String s2=in.nextLine();
        System.out.println(editDistance(s1,s2));
    }
    public static int editDistance(String string1, String string2){
        int len1= string1.length();
        int len2=string2.length();
        if (len1<=0||len1<=0)return len1==0?len2:len1;

        int[][] dp=new int[len1+1][len2+1];

        for(int i=0;i<=len1;i++){
            dp[i][0]=i;
        }
        for(int j=0;j<=len2;j++){
            dp[0][j]=j;
        }
        for(int i=1;i<=len1;i++){
            for(int j=1;j<=len2;j++){
                dp[i][j]=Math.min(Math.min(dp[i-1][j]+1,dp[i][j-1]+1),(string1.charAt(i-1)==string2.charAt(j-1)?dp[i-1][j-1]:dp[i-1][j-1]+1));
            }
        }

        return dp[len1][len2];
    }
    static int GetMinNum(int a, int b, int c)//获取三个数中最小数
    {
        int min = a < b ? a : b;
        return min < c ? min : c;
    }
}
