package main;

import com.sun.xml.internal.bind.v2.model.core.ID;

//统计一个数字在排序数组中出现的次数
public class Code63 {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,3,3,4,5};
        System.out.println(GetNumberOfK(arr,3));
    }

    //用二分查找到第一个出现k的位置
    //再向前后遍历
    //等到前后最后出现的位置
    //相减得到个数
    public static int GetNumberOfK(int [] array , int k) {

        int size=array.length;
        int left=0;
        int right=size-1;
        int mid=(right+left)/2;
        while (left<=right){
            mid=(right+left)/2;
            if (k>array[mid])
                left=mid+1;
            else if (k<array[mid])
                right=mid-1;
            else break;
        }
        if (left>right) return 0;
        left=0;
        right=size-1;
        int start=mid;
        int end=mid;
        while (start>=left) {
            if (array[start] == k)
                start--;
            else break;
        }
        while (end<=right){
            if (array[end] == k)
                end++;
            else break;
        }
        return end-start-1;
    }
}
