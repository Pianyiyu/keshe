package main;

import java.util.ArrayList;
import java.util.List;

//编写一个函数来查找字符串数组中的最长公共前缀。
//
//        如果不存在公共前缀，返回空字符串 ""。
//
//        示例 1:
//
//        输入: ["flower","flow","flight"]
//        输出: "fl"
//        示例 2:
//
//        输入: ["dog","racecar","car"]
//        输出: ""
//        解释: 输入不存在公共前缀。
public class Code25 {
    public static void main(String[] args) {
        String[] strings = {"flower","flow","flight"};
//        String[] strings = {"b", "bcb"};
        System.out.println(longestCommonPrefix(strings));
    }

    //    public static String longestCommonPrefix(String[] strs) {
//        List<String> strings = new ArrayList<>();
//        if (strs.length==1){
//            return strs[0];
//        }
//
//        for (int i = 0; i < strs.length - 1; i++) {
//            char[] chars1 = strs[i].toCharArray();
//            char[] chars2 = strs[i + 1].toCharArray();
//            String s = "";
//            if (chars1.length==0||chars2.length==0||chars1[0] != chars2[0]){
//                return "";
//            } else {
//                int length=chars1.length <chars2.length?chars1.length-1:chars2.length-1;
//                for (int j = 0; j <=length; j++) {
//                    if (chars1[j] == chars2[j]) s += chars1[j];
//                    else break;
//                }
//            }
//            strings.add(s);
//        }
//        String min="";
//        if (strings.size()>0){
//             min= strings.get(0);
//            for (String s : strings) {
//                if (s.length() < min.length()) {
//                    min = s;
//                }
//            }
//        }
//        return min;
//    }
    public static String longestCommonPrefix(String[] strs) {
        String str = "";
        if (strs.length > 0) {
            str = strs[0];
            for (int i = 1; i < strs.length; i++) {
                while (!strs[i].startsWith(str)) {
                    if (str.length() > 1) {
                        str = str.substring(0, str.length() - 1);
                    } else {
                        return "";
                    }
                }

            }
        }
        return str;
    }
}
