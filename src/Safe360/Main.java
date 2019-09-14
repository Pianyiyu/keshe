package Safe360;

import java.util.*;
//78%
//将一个字符串转换成一个整数，数值为0或者是字符串等不是一个合法的数值则返回0，小数直接取整数部分。
//要求：不能使用字符串转换整数的库函数
public class Main {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int string2int(String str) {
        boolean flag = false;
        boolean flag2 = false;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '-') flag = true;
            if (str.charAt(i) == '.') break;
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                if (flag && stringBuffer.length() == 0) {
                    flag2 = true;
                }
                stringBuffer.append(str.charAt(i));
            }
        }
        if (stringBuffer.length() == 0) return 0;
        if (stringBuffer.length()>String.valueOf(Integer.MAX_VALUE).length())return 0;
        if (flag2) {
            return -reverse(stringBuffer.toString());
        } else
            return reverse(stringBuffer.toString());
    }


    static int reverse(String s) {
        int re = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int b = s.charAt(i) - 48;
            re +=( b * Math.pow(10, s.length()-1-i));
        }
        return re ;
    }


    /******************************结束写代码******************************/


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        String _str;
        try {
            _str = in.nextLine();
        } catch (Exception e) {
            _str = null;
        }

        res = string2int(_str);
        System.out.println(String.valueOf(res));

    }
}
