package main;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

//统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
//
//请注意，你可以假定字符串里不包括任何不可打印的字符。
public class Code56 {

    public static void main(String[] args) {
        System.out.println(countSegments("Of all the gin joints in all the towns in all the world,   "));
    }
    public static int countSegments(String s) {

        if (s.length()==0) return 0;
        int count=0;
        boolean flag=false;
        char[] chars=s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]==' '){
                flag=true;
            }else if (flag||count==0) {count++;flag=false;}
        }
        return count;

    }
}
