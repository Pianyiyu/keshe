package xiecheng;

import java.util.Scanner;

public class Main2 {

    static int schedule(int m,int[] array) {
        int len = array.length;
        int s = 0;
        if (len % m != 0){
            s = len/m + 1;
        }else {
            s = len/m;
        }
        int max = Integer.MIN_VALUE;
        int i ;
        for ( i = 0; i < len; i+=s ) {
            int temp = s;
            int sum = 0;
            while (temp >= 0){
                sum +=array[i];
                temp --;
            }
            max = Math.max(max,sum);
            if (i+s > len - 1){
                break;
            }
        }


        return max;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int size  = in.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        int res = schedule(m,array);
        System.out.println(String.valueOf(res));
    }
}
