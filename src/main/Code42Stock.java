package main;

public class Code42Stock {

    public static void main(String[] args) {

        int[] arr = {3, 2, 3, 1, 2};
        int[] arr1 = {3, 3, 5, 0, 0, 3, 1, 4};
        System.out.println(Stock1(arr));
        System.out.println(Stock3(arr1));
    }

    //    假设有一个数组，它的第i个元素是一支给定的股票在第i天的价格。如果你最多只允许完成一次交易(例如,一次买卖股票),设计一个算法来找出最大利润。
//
//    样例
//    给出一个数组样例 [3,2,3,1,2], 返回 1    在1的时候买入，2的时候卖出
    public static int Stock1(int[] arr) {
        int[] profit = new int[arr.length];
        int minbuy = arr[0];
        for (int i = 1; i < arr.length; i++) {
            profit[i] = Math.max(profit[i - 1], arr[i] - minbuy);
            minbuy = Math.min(minbuy, arr[i]);

        }
        return profit[arr.length - 1];
    }

    //    题目：
//
//    用一个数组表示股票每天的价格，数组的第i个数表示股票在第i天的价格。
//
//    交易次数不限，但一次只能交易一支股票，也就是说手上最多只能持有一支股票，求最大收益。
//
//    你可以完成尽可能多的交易(多次买卖股票)。
//    然而,你不能同时参与多个交易(你必须在再次购买前出售股票)。
    public static int Stock2(int[] arr) {
        int max = 0;
        int size = arr.length;
        for (int i = 0; i < size - 1; ++i)
            if (arr[i] < arr[i + 1])
                max += arr[i + 1] - arr[i];
        return max;
    }

//    题目描述：
//
//    给定一个数组，它的第 i 个元素是一支给定的股票在第 i 天的价格。
//
//    设计一个算法来计算你所能获取的最大利润。你最多可以完成 两笔 交易。
//
//    注意: 你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
//
//    示例 1:
//
//    输入: [3,3,5,0,0,3,1,4]
//    输出: 6
//    解释: 在第 4 天（股票价格 = 0）的时候买入，在第 6 天（股票价格 = 3）的时候卖出，这笔交易所能获得利润 = 3-0 = 3 。
//    随后，在第 7 天（股票价格 = 1）的时候买入，在第 8 天 （股票价格 = 4）的时候卖出，这笔交易所能获得利润 = 4-1 = 3 。
//    示例 2:
//
//    输入: [1,2,3,4,5]
//    输出: 4
//    解释: 在第 1 天（股票价格 = 1）的时候买入，在第 5 天 （股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
//    注意你不能在第 1 天和第 2 天接连购买股票，之后再将它们卖出。
//    因为这样属于同时参与了多笔交易，你必须在再次购买前出售掉之前的股票。
//    示例 3:
//
//    输入: [7,6,4,3,1]
//    输出: 0
//    解释: 在这个情况下, 没有交易完成, 所以最大利润为 0。

    public static int Stock3(int[] arr) {
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];

        //选出从左往右最大买卖时间
        int minbuy = arr[0];
        for (int i = 1; i < arr.length; i++) {
            minbuy = Math.min(arr[i], minbuy);
            left[i] = Math.max(left[i - 1], arr[i] - minbuy);
        }

        //选出从右往左最大买卖时机
        int maxmai = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            maxmai = Math.max(maxmai, arr[i + 1]);
            right[i] = Math.max(right[i + 1], maxmai - arr[i]);
        }

        //从两者中 选出左+右最大的时机
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = Math.max(left[i] + right[i], result);
        }
        return result;
    }

}
