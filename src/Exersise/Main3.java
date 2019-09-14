package Exersise;

import java.awt.*;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int[] arr=new int[s];
        for (int i = 0; i <s; i++) {
            arr[i]=scanner.nextInt();
        }
        System.out.println(maxArea(arr));

    }

   /* public static int maxArea_(int[] arr){
        int max=0;
        int length=arr.length-1;
        while (length>=0){
            for (int i = 0,j=length; j<arr.length ; i++,j++) {

            }

            length--;
        }

    }*/

    //时间复杂度在高
    public static int maxArea(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int k = arr.length-1;
            while (k>i) {
                int min = Integer.MAX_VALUE;
                for (int j = k; j >= i; j--) {
                    if (arr[j] < min) min = arr[j];
                }
                if (max<(k-i+1)*min){
                    max=(k-i+1)*min;
                }
                k--;
            }
        }

        return max;
    }

    public static int getMaxArea(int[] height) {
        int len = height.length;
        int max = 0;//存储最大面积的
        for(int i = 0;i<len;i++){//i表示依次遍历每一个高度
            int minHeight = height[i];//设i为最小高度
            for(int j=(i+1); j<len; j++){
                minHeight = Math.min(minHeight, height[j]);//找出i之后的最小高度
                max = Math.max(max, (j-i+1)*minHeight);//计算以最小高度为高度的最大面积值
            }
        }
        return max;
    }
}
