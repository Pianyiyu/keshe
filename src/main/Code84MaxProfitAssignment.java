package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code84MaxProfitAssignment {

    public static void main(String[] args) {
//[13,37,58]
//[4,90,96]
//[34,73,45]


//[68,35,52,47,86]
//[67,17,1,81,3]
//[92,10,85,84,82]
//        int[] dif = {68, 35, 52, 47, 86};
//        int[] pro = {67, 17, 1, 81, 3};
//        int[] work = {92, 10, 85, 84, 82};
        int[] dif = {13,37,58};
        int[] pro = {4,90,96};
        int[] work = {34,73,45};
//        System.out.println(maxProfitAssignment(dif, pro, work));
    }

    //这种解法只考虑了难度和利润成正比，不周全。
    public static int maxProfitAssignment_(int[] difficulty, int[] profit, int[] worker) {
        int max = 0;
//        Arrays.sort(difficulty);
//        Arrays.sort(profit);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < worker.length; i++) {
            for (int j = 0; j < difficulty.length; j++) {
                if (difficulty[j] > worker[i]) {
                    list.add(j - 1);
                    break;
                }
                if (j == difficulty.length - 1)
                    list.add(j);
            }
        }
        for (Integer integer : list) {
            if (integer == -1) {
                continue;
            } else
                max += profit[integer];
        }
        return max;
    }


}
