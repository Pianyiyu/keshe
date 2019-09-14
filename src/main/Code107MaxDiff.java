package main;
//假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖 一次 该股票可能获得的利润是多少？
//
//例如一只股票在某些时间节点的价格为[9, 11, 8, 5, 7, 12, 16, 14]。
//
//如果我们能在价格为5的时候买入并在价格为16时卖出，则能收获最大的利润11
public class Code107MaxDiff {

    public int maxDiff(int[] nums) {
        if (nums.length==0)return 0;
        int max=0;
        int minbuy=nums[0];
        for (int i = 1; i < nums.length; i++) {
            max=Math.max(nums[i]-minbuy,max);
            minbuy=Math.min(minbuy,nums[i]);
        }
        return max;
    }
}
