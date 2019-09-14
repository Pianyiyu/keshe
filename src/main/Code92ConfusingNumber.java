package main;

import java.util.HashMap;

//给定一个数字 N，当它满足以下条件的时候返回 true：
//
//        把原数字旋转180°以后得到新的数字。
//
//        如 0, 1, 6, 8, 9 旋转 180° 以后，得到了新的数字 0, 1, 9, 8, 6 。
//
//        2, 3, 4, 5, 7 旋转 180° 后,得到的不是数字。
//
//        易混淆数字 (confusing number) 就是一个数字旋转180°以后，得到和原来不同的数字，且新数字的每一位都是有效的
public class Code92ConfusingNumber {
    public static void main(String[] args) {

        System.out.println(confusingNumber(11));
        System.out.println(confusingNumber(916));
        System.out.println(confusingNumber(6));
        System.out.println(confusingNumber(25));
    }

    public static boolean confusingNumber(int N) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,0);
        map.put(1,1);
        map.put(6,9);
        map.put(8,8);
        map.put(9,6);
        String string=String.valueOf(N);
        StringBuffer temp=new StringBuffer();
        for (int i = 0; i < string.length(); i++) {
             int n=Integer.parseInt(string.substring(i,i+1));
             if (!map.containsKey(n))
                 return false;
             temp.append(map.get(n));
        }
        return !(Integer.parseInt(string)==Integer.parseInt(temp.reverse().toString()));

    }
}
