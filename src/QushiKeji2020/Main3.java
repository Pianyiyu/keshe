package QushiKeji2020;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

//进制转换出错
public class Main3 {
    private static int calEncodeLen(String mystr) {
        if (mystr.length() == 0) return 0;
        if (mystr.length() < 2) return String.valueOf(Integer.parseInt(mystr, 3)).length();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        for (int i = 0; i < mystr.length(); i++) {
            priorityQueue.add(mystr.charAt(i) - '0');
        }
        while (priorityQueue.size()>1) {
            int i1 = priorityQueue.poll();
            int i2 = priorityQueue.poll();
            priorityQueue.add(i1 + i2);
        }
        String s=String.valueOf(priorityQueue.poll());
        return String.valueOf(Integer.parseInt(s, 2)).length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String mystr = sc.nextLine();

        int len = calEncodeLen(mystr);
        System.out.println(len);
    }
}
