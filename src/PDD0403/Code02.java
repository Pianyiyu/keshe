package PDD0403;

import java.util.Arrays;
import java.util.Scanner;

public class Code02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        String[] strings = n.split(" ");
        long[] arr = new long[strings.length];
        for (int i = 0; i < strings.length; i++) {
            arr[i] = Integer.parseInt(strings[i]);
        }


        System.out.println(maxC(arr));

    }

    public static long maxC(long[] arr){
        Arrays.sort(arr);

        if (arr.length<3)return 0;
        return Math.max(arr[arr.length-1]*arr[arr.length-2]*arr[arr.length-3],arr[0]*arr[arr.length-1]*arr[1]);
    }
}
