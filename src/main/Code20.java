package main;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//给定一个数组A[n], 定义数组的众数 ( Majority Element)
// 为数组中出现次数超过 n/2 次的元素, 假设数组A[n]非空且一定存在众数, 请设计算法找到该众数并输出.
public class Code20 {

    public static void main(String[] args) {
        int[] a={1,1,3,3,4,4,4,4,4};
        System.out.println(zhongshu(a));
    }

    public static int zhongshu(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= array.length - 1; i++) {
            if (map.containsKey(array[i])) {
                int a = map.get(array[i]);
                map.remove(array[i]);
                map.put(array[i], ++a);
            } else {
                map.put(array[i], 1);
            }
        }
        int sum=0;
        int zhi=0;
        for (Integer in : map.keySet()) {
            //map.keySet()返回的是所有key的值
            int count = map.get(in);//得到每个key多对用value的值
            if (count>sum){
                sum=count;
                zhi=in;
            }

        }
        return zhi;
    }
}
