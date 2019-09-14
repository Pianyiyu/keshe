package main;

import java.util.HashSet;

//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
//
//        示例 1:
//
//        输入: "abcabcbb"
//        输出: 3
//        解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
//        示例 2:
//
//        输入: "bbbbb"
//        输出: 1
//        解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
//        示例 3:
//
//        输入: "pwwkew"
//        输出: 3
//        解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//        请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
public class Code101LengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwakewabc"));
        System.out.println(lengthOfLongestSubstring("au"));
        System.out.println(lengthOfLongestSubstring("acbcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    //超时
//    public static int lengthOfLongestSubstring(String s) {
//        if (s.isEmpty())return 0;
//        int max=1;
//        int n=2;
//        int start=0;
//        while (n<=s.length()){
//            for (int i = start; i < s.length() - n+1; i++) {
//                HashSet<Character> set=new HashSet<>();
//                for (int j = i; j < i+n ; j++) {
//                    set.add(s.charAt(j));
//                    if (set.size()==n){
//                        start=j-n+1;
//                        i=s.length();
//                        max=n;
//                        break;
//                    }
//                }
//            }
//            n++;
//        }
//        return max;
//    }
    public  static int lengthOfLongestSubstring(String s){
        int max=0;
        for (int i = 0; i < s.length(); i++) {
            HashSet<Character> set=new HashSet<>();
            for (int j = i; j <s.length() ; j++) {
                if (set.contains(s.charAt(j))){
                    break;
                }else
                    set.add(s.charAt(j));
            }
            if (max<set.size()){
                max=set.size();
            }
        }
        return max;
    }

//    public int lengthOfLongestSubstring(String s) {
//        int max = 0, start = 0;
//        for(int i = 0; i < s.length(); i++){
//            int j;
//            for(j = start; j < i; j++)
//                if(s.charAt(j) == s.charAt(i)){
//                    start = j + 1;
//                    break;
//                }
//            if (i - start + 1 > max) max = i - start + 1;
//        }
//        return max;
//    }
}
