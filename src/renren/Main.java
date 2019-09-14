package renren;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        1,-2,4,8,-4,7,-1,-5
        String next = in.next();
        if (!next.contains(",")){
            System.out.println(Long.valueOf(next));
        }
        String[] split = next.split(",");
        long[] arr = new long[split.length];
        for (int i = 0; i < split.length; i++) {
            arr[i] = Long.valueOf(split[i]);
        }
        long sum = 0;
        long maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] > arr[i]){
                sum += arr[i];
            }else{
                sum = arr[i];
            }
            if (sum > maxSum){
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }
}
