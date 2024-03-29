package main;

import java.util.Scanner;

/**
 * 给定整数n，取若干个1到n的整数可求和等于整数m，
 * 编程求出所有组合的个数。比如当n=6，m=8时，有四种组合：[2,6], [3,5], [1,2,5], [1,3,4]。限定n和m小于120
 */
public class twosum {

    public static   void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int m=scanner.nextInt();
        System.out.println(getCount(n,m));
    }
    //0-1背包问题  f(n,m) 转化为两个子问题 f(n-1,m) 和 f(n-1,m-n)
    public static int getCount(int n, int m){
        if(m<1 || n<1) return 0;
        //大于m的部分不可能会用到
        if(m<n) n=m;
        int sum=0;
        if(m==n) sum++;
        //不选中n
        sum+=getCount(n-1,m);
        //选中n
        sum+=getCount(n-1,m-n);
        return sum;
    }

}
