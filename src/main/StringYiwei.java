package main;

import java.util.Scanner;

//小Q最近遇到了一个难题：把一个字符串的大写字母放到字符串的后面，各个字符的相对位置不变，且不能申请额外的空间。
//        你能帮帮小Q吗？
public class StringYiwei {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        System.out.println(yiwei(s));
    }

    public static String yiwei(String s){
        char[] chars=s.toCharArray();
        int legth=s.length();
        int count=0;
        for (int i = 0; i < legth-count; i++) {
            if (chars[i]>='A'&&chars[i]<='Z'){
                char temp=chars[i];
                for (int j = i; j <legth-1 ; j++) {
                    chars[j]=chars[j+1];
                }
                chars[legth-1]=temp;
                i--;
                count++;
            }
        }
        return String.valueOf(chars);
    }

}
