package main;

import java.util.HashMap;
import java.util.Map;

//给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
//
//        你可以假设数组是非空的，并且给定的数组总是存在众数。
//
//        示例 1:
//
//        输入: [3,2,3]
//        输出: 3
//        示例 2:
//
//        输入: [2,2,1,1,1,2,2]
//        输出: 2
public class Code29 {
    public static void main(String[] args) {
        int[] a = {1, 2, 1, 1, 3};
        System.out.println(majorityElement(a));
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) map.put(nums[i], map.get(nums[i]) + 1);
            else map.put(nums[i], 1);
        }
        int max = 0;
        int key = 0;
        for (Integer integer : map.keySet()) {
            if (map.get(integer) > max) {
                key = integer;
                max=map.get(integer);
            }
        }
        return key;
    }
}
