package main;

import java.util.Scanner;
import java.util.Stack;

/**
 * 整数反转
 */
public class IntReverse {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
        int num = scanner.nextInt();
        int result=PopInt(num);
        System.out.println(result);
    }

    public static int PopInt(int a){
        boolean bool=false;
        String ss="";
        if (a<0) {
            a=-a;
            bool=true;
        }
        String s=String.valueOf(a);
        Stack<String> stack=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (Integer.valueOf(String.valueOf(s.charAt(i))).equals(0))
                continue;
            stack.push(String.valueOf(s.charAt(i)));
        }
        while (!stack.isEmpty()) {
            ss=ss+String.valueOf(stack.pop());
            //ss.concat(String.valueOf(stack.pop()));
        }
        if (bool) {
            return -Integer.parseInt(ss);
        }
        else {
            return Integer.parseInt(ss);
        }
    }
}
