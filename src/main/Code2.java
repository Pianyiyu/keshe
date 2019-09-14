package main;

import java.util.LinkedList;
import java.util.Queue;

//请实现一个函数，将一个字符串中的每个空格替换成“%20”。
// 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
public class Code2 {

    public static void main(String[] args) {
        StringBuffer buffer3 = new StringBuffer();
        buffer3.append(" Happy birthday Java!");
        System.out.println(replaceSpace(buffer3));
    }


    public static String replaceSpace(StringBuffer str) {
        String s=str.toString();
        Queue<String> strings=new LinkedList<String>();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==' '){
                strings.offer("%20");
            }else {
                strings.offer(String.valueOf(s.charAt(i)));
            }
        }
        String subString="";
        for (String s1 :strings){
            subString+=s1;
        }
        return  subString;
    }
}
