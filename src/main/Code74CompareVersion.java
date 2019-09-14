package main;

import java.math.BigInteger;

public class Code74CompareVersion {
    public static void main(String[] args) {
//        "0.9.9.9.9.9.9.9.9.9.9.9.9"
//        "1.0"
        String version1 = "0.9.9.9.9.9.9.9.9.9.9.9.9";
        String version2 = "0.1";
        System.out.println(compareVersion(version1, version2));
    }

    public static int compareVersion(String version1, String version2) {
        String[] strings1 = version1.split("\\.");
        String[] strings2 = version2.split("\\.");

        int len1=strings1.length;
        int len2=strings2.length;
        int length = Math.min(strings1.length, strings2.length);
        int i;
        for (i = 0; i < length; i++) {
            if (Integer.parseInt(strings1[i]) > Integer.parseInt(strings2[i])) {
                return 1;
            } else if (Integer.parseInt(strings1[i]) < Integer.parseInt(strings2[i])) {
                return -1;
            }
        }
        if (len1>len2){
            for(int j=i;j<len1;j++){
                int tmp=Integer.parseInt(strings1[j]);
                if(tmp!=0){
                    return 1;
                }
            }
            return 0;
        }else if(len1<len2){
            for(int j=i;j<len2;j++){
                int tmp=Integer.parseInt(strings2[j]);
                if(tmp!=0){
                    return -1;
                }
            }
            return 0;
        }
        return 0;
//        String s1="";
//        String s2="";
//        for (int i = 0; i < strings1.length; i++) {
//            s1+=strings1[i];
//        }
//        for (int i = 0; i < strings2.length; i++) {
//            s2+=strings2[i];
//        }
//        if (strings1.length>strings2.length){
//            int n=strings1.length-strings2.length;
//            Integer a=Integer.getInteger(String.valueOf(s1));
//            Integer b=Integer.parseInt(String.valueOf(s2))*n*10;
//            if (a>b) return 1;
//            else return -1;
//        }else if (strings1.length<strings2.length){
//            int n=strings2.length-strings1.length;
//
//            Integer a=Integer.parseInt(String.valueOf(s2));
//            Integer b=Integer.parseInt(String.valueOf(s1))*n*10;
//            if (a>b) return -1;
//            else return 1;
//        }else {
//            Integer a=Integer.parseInt(String.valueOf(s1));
//            Integer b=Integer.parseInt(String.valueOf(s2));
//            if (a>b) return 1;
//            else if (a<b)return -1;
//            else return 0;
//        }
    }


}
