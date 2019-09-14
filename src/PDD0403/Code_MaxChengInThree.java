package PDD0403;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Code_MaxChengInThree {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int length=scanner.nextInt();
        long[] arr=new long[length];
        for (int i = 0; i < length; i++) {
            arr[i]=scanner.nextLong();
        }
        System.out.println(getMax(arr));

    }
    public static long getMax(long[] arr){
        Arrays.sort(arr);
        return Math.max(arr[0]*arr[1]*arr[arr.length-1],arr[arr.length-1]*arr[arr.length-2]*arr[arr.length-3]);
    }


//
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    ArrayList<Long> arr = new ArrayList<>();
//        for (int i=0; i!=n; i++) {
//        arr.add(sc.nextLong());
//    }
//        Collections.sort(arr);
//    long max = arr.get(0) * arr.get(1) * arr.get(n-1);
//    max = Math.max(arr.get(n-3) * arr.get(n-2)* arr.get(n-1), max);
//        System.out.println(max);
}
