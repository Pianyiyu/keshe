package main;

import java.util.ArrayList;
import java.util.List;

//给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
//
//        例如，给出 n = 3，生成结果为：
//
//        [
//        "((()))",
//        "(()())",
//        "(())()",
//        "()(())",
//        "()()()"
//        ]
public class Code108GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();

        return list;
    }
    public void generate(List<String> list,String ans,int count1,int count2,int n){
        if (count1>n||count2>n)return;
        if (count1==n&&count2==n) list.add(ans);

        if (count1>=count2) {
            String ans1 = new String(ans);
            generate(list, ans+"(", count1 + 1, count2, n);
            generate(list, ans1+")", count1, count2 + 1, n);
        }
    }
}
