package Tengxun0405;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int m = Integer.parseInt(scanner.nextLine());
        String s=scanner.nextLine();

        if (s.length()==0)return;
        if (s.length()==1) System.out.println(1);

        System.out.println(leastS(s));
    }

    public static int leastS(String s){

        int a=0;
        int b=0;
        char[] chars=s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
           if (chars[i]=='0'){
               a++;
           }
           if (chars[i]=='1')
               b++;
        }
        return Math.abs(a-b);
    }


}
