package main;

import java.util.HashMap;
import java.util.Map;

//在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符
//        并返回它的位置, 如果没有则返回 -1（需要区分大小写）
public class Code65 {
    public int FirstNotRepeatingChar(String str) {
        Map<Integer,Character> map=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(i,str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            char j=map.get(i);
            map.remove(i);
            if (!map.containsValue(j))
                return i;
            map.put(i,j);
        }
        return -1;
    }
}
