package Exersise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();

        System.out.println(dafu(s));
    }


    public static int dafu(int n){
        if (n<=0)return 0;
        if (n==1)return 1;
        if (n==2)return 2;
        if (n==3)return 4;
        if (n==4)return 8;
        if (n==5)return 16;
        if (n==6)return 32;
        return dafu(n-1)+dafu(n-2)+dafu(n-3)+dafu(n-4)+dafu(n-5)+dafu(n-6);

    }
}
