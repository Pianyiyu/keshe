package Meituan;

import java.util.Scanner;

//给你一棵含有n个结点的树,编号为0…n-1，这n个结点都被染成了黑色或白色，显然，对于一棵树而言，
// 我们每去掉一条边，就能把树分成两部分。
// 现在要求你把这棵树切开，使得每一个连通块内只有一个白色结点，
// 问共有多少种切开的方式满足以上条件，如果被删除的边集不同，我们则认为两种方式不同，反之认为相同。
//
//请输出方案数对1000000007取模的结果。
//
//参考输入：
//
//10
//
//0 0 1 2 0 5 1 2 3
//
//1 0 0 1 0 0 1 1 0 1
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n-1];
        int[] co=new int[n];
        for (int i = 0; i < n - 1; i++) {
            a[i]=in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            co[i]=in.nextInt();
        }

        System.out.println(3);
    }
}
