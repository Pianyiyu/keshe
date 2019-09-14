package main;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.logging.Level;

//0-1背包
public class Code37 {
    static int[] w = {3, 6, 2, 1};
    static int[] x=new int[w.length];
    static int[] v = {4, 5, 2, 1};
    static int weight=9;
    static int weight_=weight;
    static int[][] dp = new int[w.length][weight + 1];


    public static void main(String[] args) {
        int[][] a = dp_maxValue(w, v, weight);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + "    ");

            }
            System.out.println("-");
        }
        System.out.println("---------------------------");
        traceback();
//        System.out.println(dp_maxValue(w, v, 8));
//        System.out.println(dp_maxValue(w, v, 9));
//        System.out.println(dp_maxValue(w, v, 10));
//        System.out.println(dp_maxValue(w, v, 11));
//        System.out.println(dp_maxValue(w, v, 12));

//        System.out.println(rec_maxValue(w,v,weight,w.length-1));
        System.out.println(Make(w.length-1,weight));
    }

//    public static int rec_maxValue(int[] w,int[] values,int weight,int i){
//
//        int maxvalue=0;
//        if (weight==0){
//            return maxvalue;
//        }
//
//        if (i==0) {
//            if (w[0]>weight)return 0;
//            else {
//                maxvalue+=values[0];
//            }
//            return maxvalue;
//        }
//        if (w[i]>weight) return rec_maxValue(w,values,weight,i-1);
//        return Math.max(rec_maxValue(w,values,weight,i-1),rec_maxValue(w,values,weight-w[i],i-1));
//    }
    //function Make( i {处理到第i件物品} , j{剩余的空间为j}) :integer;
    static int Make(int i, int j)
    {
        int r1 = 0;
        int r2 = 0;
        int r = 0;
        if (weight==0){
            return 0;
        }

        if (i == -1)
        {
            return 0;
        }

        if(j >= w[i])   //背包剩余空间可以放下物品 i
        {
            r1 = Make(i-1,j - w[i]) + v[i]; //第i件物品放入所能得到的价值
            r2 = Make(i-1,j); //第i件物品不放所能得到的价值
            r = (r1>r2)?r1:r2;
        }

        return r;
    }


    public static int[][] dp_maxValue(int[] w, int[] values, int weight) {

//        for (int i = 0; i < w.length; i++) {
//            for (int j = 0; j < weight + 1; j++) {
//                if (w[i] > j) dp[i][j] = 0;
//                else dp[i][j] = values[i];
//            }
//        }
        for (int i = 0; i < weight; i++) {
            if (i >= w[0]) dp[0][i] = values[0];
            else dp[0][i] = 0;
        }
        for (int i = 0; i < w.length; i++) {
            dp[i][0] = 0;
        }

        for (int i = 1; i < w.length; i++) {
            for (int j = 1; j < weight + 1; j++) {
                if (j < w[i]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j - w[i]] + values[i], dp[i - 1][j]);
                }
            }
        }

        int max = 0;
        for (int i = 0; i < w.length; i++) {
            for (int j = 0; j < weight + 1; j++) {
                max = Math.max(max, dp[i][j]);
            }
        }
        System.out.println(max);

        return dp;
    }

   static void traceback()
    {
        for(int i=w.length-1;i>=1;i--)
        {
            if(dp[i][weight_]==dp[i-1][weight_])
                x[i]=0;
            else
            {
                x[i]=1;
                weight_-=w[i];
            }
            System.out.println(i+"wei"+x[i]);
        }
        x[0]=(dp[0][weight_]>0)?1:0;
        System.out.println("0"+"wei"+x[0]);
    }
}
