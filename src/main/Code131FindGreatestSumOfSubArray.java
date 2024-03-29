package main;
//连续子数组的最大和

//例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。
//        给一个数组，返回它的最大连续子序列的和，你会不会被他忽悠住？(子向量的长度至少是1)
public class Code131FindGreatestSumOfSubArray {

    public static void main(String[] args) {
        int[] a={6,-3,-2,7,-15,1,2,2};
        System.out.println(FindGreatestSumOfSubArray(a));
    }
    public static int FindGreatestSumOfSubArray(int[] array) {
        if (array.length == 0) return 0;
        int sum = array[0], tempsum = array[0]; //注意初始值 不能设为0 防止只有负数
        for (int i = 1; i < array.length; i++) //从1开始 因为0的情况在初始化时完成了
        {
            tempsum = (tempsum < 0) ? array[i] : tempsum + array[i];
            sum = (tempsum > sum) ? tempsum : sum;
        }
        return sum;
    }
}
