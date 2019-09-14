package main;

import javax.management.MXBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，
//        那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
//        {[2,3,4],2,6,2,5,1}，
//        {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
public class Code72 {

    public static void main(String[] args) {
        int[] num={2,3,4,2,6,2,5,1};
        System.out.println(maxInWindows(num,3));

    }
    public static ArrayList<Integer> maxInWindows(int [] num, int size)
    {

        ArrayList<Integer> list=new ArrayList<Integer>();
        if (size==0||num.length==0)return list;
        int length=num.length;
        for (int i = 0; i < length - size+1; i++) {
            int max=0;
            for (int j = i; j <size+i ; j++) {
                max=Math.max(num[j],max);
            }
            list.add(max);
        }
        return list;
    }
}
