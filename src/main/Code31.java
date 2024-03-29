package main;

import com.sun.org.apache.bcel.internal.generic.LUSHR;
import com.sun.scenario.effect.Merge;
import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.*;
import java.util.concurrent.ThreadPoolExecutor;

//给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
//
//        说明:
//
//        初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
//        你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
//        示例:
//
//        输入:
//        nums1 = [1,2,3,0,0,0], m = 3
//        nums2 = [2,5,6],       n = 3
//
//        输出: [1,2,2,3,5,6]
public class Code31 {
    public static void main(String[] args) {
        int[] num1={1,2,3,0,0,0};
        int[] num2={2,5,6};
        System.out.println(merge(num1,3,num2,3));
    }
    public static List<Integer> merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list1=new ArrayList<>();
        for (int i = 0; i < m; i++) {
            list1.add(nums1[i]);
        }
        for (int i = 0; i < n; i++) {
            list1.add(nums2[i]);
        }
        list1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1>o2) return 1;
                else if (o1==o2) return 0;
                else return -1;
            }
        });
        for (int i = 0; i < list1.size(); i++) {
            nums1[i]=list1.get(i);
            System.out.println(list1.get(i));
        }
        return list1;
    }
}
