package main;
//给定一个整数数组 nums ，找出一个序列中乘积最大的连续子序列（该序列至少包含一个数）。
//
//        示例 1:
//
//        输入: [2,3,-2,4]
//        输出: 6
//        解释: 子数组 [2,3] 有最大乘积 6。
//        示例 2:
//
//        输入: [-2,0,-1]
//        输出: 0
//        解释: 结果不能为 2, 因为 [-2,-1] 不是子数组。
public class Code87MaxProduct {

    //来回求最大值
    public int maxProduct(int[] nums) {
        int a=1;
        int max=nums[0];

        for(int num:nums){
            a=a*num;
            if(max<a)max=a;
            if(num==0)a=1;

        }
        a=1;
        for(int i=nums.length-1;i>=0;i--){
            a=a*nums[i];
            if(max<a)max=a;
            if(nums[i]==0)a=1;
        }
        return max;
    }
}
