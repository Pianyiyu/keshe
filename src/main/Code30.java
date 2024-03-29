package main;

import java.util.HashMap;

//编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target。该矩阵具有以下特性：
//
//        每行的元素从左到右升序排列。
//        每列的元素从上到下升序排列。
//        示例:
//
//        现有矩阵 matrix 如下：
//
//        [
//        [1,   4,  7, 11, 15],
//        [2,   5,  8, 12, 19],
//        [3,   6,  9, 16, 22],
//        [10, 13, 14, 17, 24],
//        [18, 21, 23, 26, 30]
//        ]
//        给定 target = 5，返回 true。
//
//        给定 target = 20，返回 false。
public class Code30 {
    public static void main(String[] args) {
//        int[][] matrix={{1,4,7,1,5},{2,5,  8, 12, 19},{3,   6,  9, 16, 22},{10, 13, 14, 17, 24},{18, 21, 23, 26, 30}};
        int[][] matrix={{1},{1}};
        System.out.println(searchMatrix(matrix,2));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        if (matrix.length==0)return false;
        boolean flag=false;
        int a=0;//行
        int b=matrix[0].length-1;//列
        for (;;){
            if (b<0||a>matrix.length-1){
                flag=false;
                break;
            }
            if (target>matrix[a][b]){
                a=a+1;
            }else if (target<matrix[a][b]){
                b=b-1;
            }else{
                flag=true;
                break;
            }
        }
        return  flag;
    }
}
