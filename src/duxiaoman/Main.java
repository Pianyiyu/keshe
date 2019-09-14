package duxiaoman;

import java.util.Scanner;

//珐达采下个月要去鸥洲各国考察一趟，采购流通神秘石并从中搞点油水。
//
//        珐达采会按顺序依次经过序号分别为1, 2, 3, …,
// n的鸥洲国家，在第i个国家神秘石的流通价格为Ai鸥。因为行程紧张，在每个国家的停留时间有限，所以他只能花费Ai鸥买入一块神秘石，或者卖出一块手中的神秘石获得Ai
// 鸥，或者什么都不做，而且因为神秘石的保存需要极其先进的高级材料容器，其材料稀有且制作困难，珐达采只有一份容器，故无论何时珐达采手里最多只能拥有一块神秘石。
//
//        珐达采想知道最终能从中获利最大多少鸥。因为交易需要手续费，所以珐达采还想知道在获利最大收益的同时，最少需要交易多少次。因为珐达采是大财阀，所以你可以认为他一开始金钱无限。


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s1 = in.nextInt();
        int[] arr = new int[s1];
        for (int i = 0; i < s1; i++) {
            arr[i] = in.nextInt();
        }
        int[] a = func(arr);
        for (Integer integer : a) {
            System.out.print(integer + " ");
        }
    }
    public static int[] func(int[] array) {
        int[] re = new int[2];
        int max = 0;
        int cishu = 0;
        boolean flag = false;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                max += array[i] - array[i - 1];
                if (flag) {
                    cishu += 2;
                    flag = false;
                    continue;
                }
            }
            flag=true;
        }
        re[0] = max;
        re[1] = cishu;
        return re;
    }
}
