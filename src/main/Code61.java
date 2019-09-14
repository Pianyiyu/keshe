package main;

import com.sun.org.apache.bcel.internal.classfile.Code;

import java.util.ArrayList;

//输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵：
//        1  2  3  4
//        5  6  7  8
//        9  10 11 12
//        13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
public class Code61 {

    public static void main(String[] args) {
//        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//        int[][] arr={{1}};
//        int[][] arr={{1,2},{3,4}};
        int[][] arr={{1},{2},{3},{4},{5}};
        System.out.println(printMatrix(arr));
    }

    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        int width=matrix[0].length;
        int height=matrix.length;
        if (width<=0|| height<=0)return null;
        ArrayList<Integer> list=new ArrayList<>();

        int left=0;
        int right=width-1;
        int top=0;
        int bottom=height-1;
        while (left<=right&&top<=bottom){
            //left->right
            for (int i = left; i <=right; i++) {
                list.add(matrix[top][i]);
            }
            //top->bottom
            for (int i = top+1; i <=bottom; i++) {
                list.add(matrix[i][right]);
            }
            //right->left
            if (top != bottom)
            for (int i = right-1; i >=left; i--) {
                list.add(matrix[bottom][i]);
            }
            //bottom->top
            if (left != right)
            for (int i = bottom-1; i >top ; i--) {
                list.add(matrix[i][left]);
            }
            left++;right--;top++;bottom--;
        }

        return list;
    }
}
