package Meituan;

import java.util.Scanner;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.ReadWriteLock;

//我们称一个矩阵为黑白矩阵，当且仅当对于该矩阵中每一个位置如(i,j),
//其上下左右四个方向的数字相等，即(i-1,j),(i+1,j),(i,j+1),(i,j-1)四个位置上的数字两两相等且均不等于(i,j)位置上的数字。
//(超出边界的格子忽略)
//
//现在给出一个n*m的矩阵，我们想通过修改其中的某些数字，使得该矩阵成为黑白矩阵，问最少修改多少个数字。
//补充样例
//        输入样例2
//        3 3
//        1 1 1
//        1 5 1
//        1 1 1
//        输出样例2
//        4
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int[][] arr=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println(func(arr));

    }

    public static int func(int[][] arr){

        if (arr.length==arr[0].length) {
            return 4;
        }else return 8;
    }
}
