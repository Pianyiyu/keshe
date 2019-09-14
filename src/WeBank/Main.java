package WeBank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < a; i++) {
            if (arr[i] <= 0) System.out.println(-1);
            else {
                System.out.println(ps(arr[i]));
                //System.out.println();
            }
        }
    }

    public static int ps(int num) {
        if (num == 1) return 0;
        if (num == 2) return 1;
        //if (num==3) return 7;
        if (num % 2 == 1) return ps(num * 3 + 1) + 1;
        else return ps(num / 2) + 1;
    }
}
