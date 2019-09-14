package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//
//给定一个整数数组 a，其中1 ≤ a[i] ≤ n （n为数组长度）, 其中有些元素出现两次而其他元素出现一次。
//
//        找到所有出现两次的元素。
//
//        你可以不用到任何额外空间并在O(n)时间复杂度内解决这个问题吗？
//
//        示例：
//
//        输入:
//        [4,3,2,7,8,2,3,1]
//
//        输出:
//        [2,3]
public class Code32 {

    public static void main(String[] args) {
        int[] nums={4,3,2,7,7};
        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums) {

        if (nums.length==0) return null;
        List<Integer> list =new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; ) {
            if (nums[i]==nums[i+1]){list.add(nums[i]);i+=2;}else i+=1;

        }
        return list;
    }
}
