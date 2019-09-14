package shunfeng;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int v = in.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < v; i++) {
            int key = in.nextInt();
            int value = in.nextInt();
            map.put(key,value);
        }
        System.out.println(map);
    }

}
