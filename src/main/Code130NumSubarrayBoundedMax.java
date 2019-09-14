package main;
//区间子数组个数


//给定一个元素都是正整数的数组A ，正整数 L 以及 R (L <= R)。
//
//        求连续、非空且其中最大元素满足大于等于L 小于等于R的子数组个数。
//
//        例如 :
//        输入:
//        A = [2, 1, 4, 3]
//        L = 2
//        R = 3
//        输出: 3
//        解释: 满足条件的子数组: [2], [2, 1], [3].
public class Code130NumSubarrayBoundedMax {

    public int numSubarrayBoundedMax(int[] A, int L, int R) {
        // 最大元素满足大于等于L小于等于R的子数组个数 = 最大元素小于等于R的子数组个数 - 最大元素小于L的子数组个数
        return numSubarrayBoundedMax(A, R) - numSubarrayBoundedMax(A, L - 1);
    }

    public int numSubarrayBoundedMax(int[] A, int max) {
        int result = 0;
        int num = 0;
        for (int i : A) {
            if (i <= max) {
                num += 1;
                result = num;
            } else {
                num = 0;
            }
        }
        return result;
    }


}
