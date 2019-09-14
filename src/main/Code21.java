package main;

import jdk.nashorn.internal.runtime.FindProperty;
import sun.applet.Main;

import javax.sound.midi.Soundbank;
import java.util.Stack;

//给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。
//
//        注意:
//
//        给定的整数保证在32位带符号整数的范围内。
//        你可以假定二进制数不包含前导零位。
//        示例 1:
//
//        输入: 5
//        输出: 2
//        解释: 5的二进制表示为101（没有前导零位），其补数为010。所以你需要输出2。
//        示例 2:
//
//        输入: 1
//        输出: 0
//        解释: 1的二进制表示为1（没有前导零位），其补数为0。所以你需要输出0。
public class Code21 {
    public static void main(String[] args) {
        int a=findComplement(10);
        System.out.println(a);
    }
    public static int findComplement(int num) {
        //转换成二进制
        String string= Integer.toBinaryString(num);
        //二进制取反
        String sstring="";
        char[] chars= string.toCharArray();
        for (int i = 0; i < chars.length ; i++) {
            if (chars[i]=='1'){
                sstring+="0";
            }else {
                sstring+="1";
            }
        }
        return  Integer.parseInt(sstring,2);
    }



//    转换成二进制
    public static String binaryToDecimal(int n){
        String str = "";
        while(n!=0){
            str = n%2+str;
            n = n/2;
        }
        System.out.println(str);
        return str;
    }
}
