package main;

//给定两个大小相等的数组 A 和 B，A 相对于 B 的优势可以用满足 A[i] > B[i] 的索引 i 的数目来描述。
//
//        返回 A 的任意排列，使其相对于 B 的优势最大化。
//
//
//
//        示例 1：
//
//        输入：A = [2,7,11,15], B = [1,10,4,11]
//        输出：[2,11,7,15]
//        示例 2：
//
//        输入：A = [12,24,8,32], B = [13,25,32,11]
//        输出：[24,32,8,12]

import java.util.*;

public class Code126SAdvantageCount {
    public static void main(String[] args) {
        int[] a={2,7,11,5};
        int[] b={1,10,4,11};
        System.out.println(advantageCount(a,b));
    }


    public static  int[] advantageCount(int[] A, int[] B) {

        Arrays.sort(A);

        // 存储B中数据的位置
        Map<Integer, List<Integer>> map = new HashMap<>(B.length);
        for (int i = 0; i < B.length; i++) {
            List<Integer> list = map.get(B[i]);
            if (list == null) {
                list = new ArrayList<>();
                map.put(B[i], list);
            }
            list.add(i);
        }
        Arrays.sort(B);

        int[] res = new int[A.length];

        int l = 0;
        int r = B.length - 1;

        // 如果A的最小比B的最小小，则A的最小对B的最大
        // 如果A的最小比B的最小大，则A的最小对B的最小
        for (int i = 0; i < A.length; i++) {

            int val = 0;

            if (A[i] > B[l]) {
                val = B[l++];
            } else {
                val = B[r--];
            }

            List<Integer> list = map.get(val);
            Integer index = list.remove(0);
            res[index] = A[i];
        }

        return res;
    }
}
