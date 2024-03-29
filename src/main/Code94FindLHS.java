package main;

import java.util.Arrays;

//和谐数组是指一个数组里元素的最大值和最小值之间的差别正好是1。
//
//        现在，给定一个整数数组，你需要在所有可能的子序列中找到最长的和谐子序列的长度。
//
//        示例 1:
//
//        输入: [1,3,2,2,5,2,3,7]
//        输出: 5
//        原因: 最长的和谐数组是：[3,2,2,2,3].
public class Code94FindLHS {
    public static void main(String[] args) {
        int[] arr={1,3,2,2,5,2,3,4,7};
        System.out.println(findLHS(arr));

    }

    public static int findLHS(int[] nums) {
        if(nums == null || nums.length <= 1){
            return 0;
        }
        Arrays.sort(nums);
        //记录差值中小的的个数
        int preLength = 0;
        //计算差值中大的的个数
        int curLength = 1;
        int max = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i + 1] == nums[i]){
                curLength++;
            }
            else if(nums[i + 1] == nums[i] + 1){
                preLength = curLength;
                curLength = 1;
            }
            else{
                preLength = 0;
                curLength = 1;
            }
            if(preLength != 0 && curLength + preLength > max){
                max = curLength + preLength;
            }
        }
        return max;
    }
}
