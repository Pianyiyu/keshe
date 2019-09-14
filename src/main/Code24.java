package main;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//给定一个只包含整数的有序数组，每个元素都会出现两次，唯有一个数只会出现一次，找出这个数。
////
////        示例 1:
////
////        输入: [1,1,2,3,3,4,4,8,8]
////        输出: 2
////        示例 2:
////
////        输入: [3,3,7,7,10,11,11]
////        输出: 10
////        注意: 您的方案应该在 O(log n)时间复杂度和 O(1)空间复杂度中运行。
public class Code24 {

    public static void main(String[] args) {
        int[] a={1,1,2};
        System.out.println(singleNonDuplicate(a));
    }
    public static int singleNonDuplicate(int[] nums) {
        if (nums.length==0){
            return -1;
        }


        for (int i = 0; i < nums.length-1;) {
            if (nums[i]==nums[i+1]){
                i+=2;
            }else {
               return nums[i];
            }
            if (i==nums.length-1)return nums[nums.length-1];
        }
        return -1;
    }
}
