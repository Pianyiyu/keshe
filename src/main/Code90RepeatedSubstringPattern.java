package main;

import java.util.HashSet;
//给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。
//
//        示例 1:
//
//        输入: "abab"
//
//        输出: True
//
//        解释: 可由子字符串 "ab" 重复两次构成。
//        示例 2:
//
//        输入: "aba"
//
//        输出: False
//        示例 3:
//
//        输入: "abcabcabcabc"
//
//        输出: True
//
//        解释: 可由子字符串 "abc" 重复四次构成。 (或者子字符串 "abcabc" 重复两次构成。)
public class Code90RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {

        int len=s.length();
        if (len<=1) return false;
        //找出所有可能的组合 4-》1，2
        //6->1,2,3
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        int sqrt=(int) Math.sqrt(len);
        for (int i = 2; i <=sqrt ; i++) {
            if (len%i==0){
                set.add(i);
                set.add(len/i);
            }
        }
        
        for (Integer integer:set){
            String temp=s.substring(0,integer);
            int i ;
            for ( i=integer; i < len; i=i+integer) {
                if (!temp.equals(s.substring(i,i+integer)))break;
            }           
            if (i==len)return true;
        }
        return false;
    }
}
