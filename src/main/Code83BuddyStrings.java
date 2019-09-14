package main;

import javafx.scene.control.Alert;

import java.util.ArrayList;
import java.util.List;

public class Code83BuddyStrings {
//    public boolean buddyStrings(String A, String B) {
//
//        if (A.length()!=B.length()||A.length() <= 1) return false;
//        //如果是相等，只要存在有一个元素重复，就可以进行交换。
//        if (A.equals(B)){
//            char[] a = A.toCharArray();
//            for (char c : a) {
//                if (A.indexOf(c)!=A.lastIndexOf(c)) {
//                    return true;
//                }
//            }
//        }
//        //如果不等
//        char[] a=A.toCharArray();
//        char[] b=A.toCharArray();
//        List<Character> la=new ArrayList<>();
//        List<Character> lb=new ArrayList<>();
//        for (int i = 0; i < A.length(); i++) {
//            if (a[i]!=b[i]){
//                la.add(a[i]);
//                lb.add(b[i]);
//            }
//        }
//        if (la.size() != 2) {
//            return false;
//        } else if (la.get(1) == lb.get(0) && la.get(0) == lb.get(1)) {
//            return true;
//        }
//        return false;
//    }
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length() || A.length() <= 1) {
            return false;
        } else if (A.equals(B)) {
            char[] a = A.toCharArray();
            for (char c : a) {
                if (A.indexOf(c)!=A.lastIndexOf(c)) {
                    return true;
                }
            }
        } else {
            char[] a = A.toCharArray();
            char[] b = B.toCharArray();
            List<Character> la = new ArrayList<>();
            List<Character> lb = new ArrayList<>();
            for (int i = 0; i < A.length(); i++) {
                if (a[i] != b[i]) {
                    la.add(a[i]);
                    lb.add(b[i]);
                }
            }
            if (la.size() != 2) {
                return false;
            } else if (la.get(1) == lb.get(0) && la.get(0) == lb.get(1)) {
                return true;
            }
        }
        return false;
    }
}
