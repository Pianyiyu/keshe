package KuaiShou;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        String[] strings=s.split(",");
        int a,b;
        a=Integer.parseInt(strings[0]);
        b=Integer.parseInt(strings[1]);
        if (a>=b)
            System.out.println(a-b);

    }
    public static int ps(int[] arr,int a,int b){

        if (a>b) return a-b;



        return 0;

    }
}
