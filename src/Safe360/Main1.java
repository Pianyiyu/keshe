package Safe360;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
//AC
public class Main1 {
    /*请完成下面这个函数，实现题目要求的功能
当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
******************************开始写代码******************************/
    static int main(int arr[]) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i]) + 1);
            else map.put(arr[i], 1);
        }
        int[] re = new int[map.size()];
        int i = 0;
        for (Integer integer : map.values()) {
            re[i++] = integer;
        }
        Arrays.sort(re);
        int a = re[0];
        while (a >= 2) {
            boolean flag = true;
            for (int j = 0; j < re.length; j++) {
                if (re[j] % a != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                int sum=0;
                for (int j = 0; j < re.length; j++) {
                    sum+=re[j]/a;
                }
                return  sum;
            }
            a--;
        }
        return 0;
    }

    /******************************结束写代码******************************/


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int num = in.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = in.nextInt();
        }
        res = main(arr);
        System.out.println(String.valueOf(res));

    }
}
