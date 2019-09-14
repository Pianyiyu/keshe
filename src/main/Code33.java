package main;

import java.security.Key;
import java.util.Arrays;

//给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
//
//
//
//        示例 1：
//
//        输入：[-4,-1,0,3,10]
//        输出：[0,1,9,16,100]
//        示例 2：
//
//        输入：[-7,-3,2,3,11]
//        输出：[4,9,9,49,121]
public class Code33 {

    public static void main(String[] args) {
        int[] a={-4,-1,0,3,10,3};
        int[] b=sortedSquares(a);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

    public static int[] sortedSquares(int[] A) {

        int[] a=new int[A.length];
        for (int i = 0; i < A.length; i++) {
            a[i]=A[i]*A[i];
        }
        Arrays.sort(a);

        return a;
    }
}
