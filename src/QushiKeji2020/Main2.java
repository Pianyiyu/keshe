package QushiKeji2020;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//66%
public class Main2 {

    // please don't modify any code below.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = (Integer)sc.nextInt();
        List<Integer> list =new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                if (i==0)
                    list.add(1);
                else if (i==1)
                    list.add(5);
                else if (i==2)
                    list.add(10);
                else if (i==3)
                    list.add(20);
                else if (i==4)
                    list.add(50);
                else if (i==5)
                    list.add(100);
            }
        }

        int[] arr1 = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr1[i]=list.get(i);
        }
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list_ = new ArrayList<>();
        df(arr1, sum, 0, lists, list_);
        List<List<Integer>> collect = lists.stream().map(item -> item).distinct().collect(Collectors.toList());
        long target = 0;
        for (int i = 0; i < collect.size(); i++) {
            target+=collect.get(i).size();
        }
        System.out.println(target);
    }

    private static void df(int[] arr, int sum, int index, List<List<Integer>> lists, List<Integer> list) {
        if (sum == 0) {
            lists.add(new ArrayList<>(list));
            return;
        }
        if (sum < 0) return;
        for (int i = index; i < arr.length; i++) {
            if (arr[i] > sum) continue;
            list.add(arr[i]);
            df(arr, sum - arr[i], i + 1, lists, list);
            list.remove(list.size() - 1);
        }
    }
}
