package XiaoMi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;

public class Main1 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int solution(int[] prices, int budget) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        calculate(result,temp,prices,0,budget,Integer.MAX_VALUE);
        if (result.size() == 0){
            return -1;
        }else {
            int sum = Integer.MAX_VALUE;
            for (List<Integer> list : result){
                sum = Math.min(sum ,list.size());
            }
            return sum;
        }
    }
    /******************************结束写代码******************************/
    private static void calculate(List<List<Integer>> result, List<Integer> temp
            ,int[] prices,int index,int budget ,int minsize) {
        if (budget < 0)
            return;
        if (budget == 0 ) {
            result.add(new ArrayList<>(temp));  //返回一个新的集合
            minsize = Math.min(temp.size(),minsize);
            return;
        }
        for (int i = index; i < prices.length; i++) {
            temp.add(prices[i]);
            if (minsize < temp.size()){
                continue;
            }
            calculate(result, temp, prices ,i, budget - prices[i],minsize);
            temp.remove(temp.size() - 1);  //删除刚加进去的那个
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _prices_size = 0;
        _prices_size = Integer.parseInt(in.nextLine().trim());
        int[] _prices = new int[_prices_size];
        int _prices_item;
        for(int _prices_i = 0; _prices_i < _prices_size; _prices_i++) {
            _prices_item = Integer.parseInt(in.nextLine().trim());
            _prices[_prices_i] = _prices_item;
        }

        int _budget;
        _budget = Integer.parseInt(in.nextLine().trim());

        res = solution(_prices, _budget);
        System.out.println(String.valueOf(res));

    }
}
