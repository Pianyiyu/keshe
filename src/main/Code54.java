package main;

import java.util.HashMap;
import java.util.Vector;

//
//给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
//
//        你的算法时间复杂度必须是 O(log n) 级别。
//
//        如果数组中不存在目标值，返回 [-1, -1]。
//
//        示例 1:
//
//        输入: nums = [5,7,7,8,8,10], target = 8
//        输出: [3,4]
//        示例 2:
//
//        输入: nums = [5,7,7,8,8,10], target = 6
//        输出: [-1,-1]
public class Code54 {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int[] res = new int[]{-1, -1};

        while (left <= right) {
            int mid = (left + right) / 2;
            if(nums[mid] >= target) {
                right = mid - 1;
            }else  {
                left = mid + 1;
            }
        }
        if(left < nums.length && nums[left] == target) {
            res[0] = left;
        }
        left = 0;
        right = nums.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;
            if(nums[mid] > target) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        if(right >= 0 && nums[right] == target) {
            res[1] = right;
        }
        return res;

    }
}
