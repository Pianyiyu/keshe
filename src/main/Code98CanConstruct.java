package main;

import java.security.Key;
import java.util.HashMap;

//给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。如果可以构成，返回 true ；否则返回 false。
//
//        (题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。)
//
//        注意：
//
//        你可以假设两个字符串均只含有小写字母。
//
//        canConstruct("a", "b") -> false
//        canConstruct("aa", "ab") -> false
//        canConstruct("aa", "aab") -> true
public class Code98CanConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < ransomNote.length();i++) {
            if (map1.containsKey(ransomNote.charAt(i))){
                map1.put(ransomNote.charAt(i),map1.get(ransomNote.charAt(i))+1);
            }else
                map1.put(ransomNote.charAt(i),1);
        }
        for (int i = 0; i < magazine.length(); i++) {
            if (map2.containsKey(magazine.charAt(i))){
                map2.put(magazine.charAt(i),map2.get(magazine.charAt(i))+1);
            }else
                map2.put(magazine.charAt(i),1);
        }
        for (Character character:map1.keySet()){
            if (map2.containsKey(character)){
                if (map2.get(character)<map1.get(character)){
                    return false;
                }
            }else return false;
        }
        return true;
    }
}
