package main;

import java.util.ArrayList;
import java.util.List;


//给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
//
//        示例:
//
//        输入: n = 4, k = 2
//        输出:
//        [
//        [2,4],
//        [3,4],
//        [2,3],
//        [1,2],
//        [1,3],
//        [1,4],
//        ]
public class Combine {

    public static void main(String[] args) {
        combine(2,2);

    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> now=new ArrayList<Integer>();
        find(1,now,list,n,k);
        return list;
    }
    public static void find(int start,List<Integer> now,List<List<Integer>> list,int n, int k){
        if(k==0){//递归的终点
            list.add(new ArrayList(now));
            return;
        }
        for(int i=start;i<=n-k+1;i++){
            now.add(i);//前进
            find(i+1,now,list,n,k-1);
            now.remove(now.size()-1);//回溯
        }

    }
}
