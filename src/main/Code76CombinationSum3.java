package main;

import java.util.ArrayList;
import java.util.List;

//
//找出所有相加之和为 n 的 k 个数的组合。组合中只允许含有 1 - 9 的正整数，并且每种组合中不存在重复的数字。
//
//        说明：
//
//        所有数字都是正整数。
//        解集不能包含重复的组合。
//        示例 1:
//
//        输入: k = 3, n = 7
//        输出: [[1,2,4]]
public class Code76CombinationSum3 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        calculate(result, temp, 1, k, n);
        return result;
    }

    private void calculate(List<List<Integer>> result, List<Integer> temp
            , int index, int k, int n) {
        if (n < 0)
            return;
        if (n == 0 && temp.size() == k) {
            result.add(new ArrayList<>(temp));  //返回一个新的集合
            return;
        }
        for (int i = index; i < 10; i++) {
            temp.add(i);
            calculate(result, temp, i + 1, k, n - i);
            temp.remove(temp.size() - 1);  //删除刚加进去的那个
        }
    }
}
