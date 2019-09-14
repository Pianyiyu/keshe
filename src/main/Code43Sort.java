package main;

//排序

import java.util.ArrayList;

public class Code43Sort {

    public static void main(String[] args) {

        int[] arr = {1, 4, 2, 5, 3};
        int[] arr1 = {4, 2};

        int[] arr2 = {7, 8, 5, 3, 6, 4};
//        System.out.println(bubbleSort(arr));
//        System.out.println(selectSort(arr));
//        System.out.println(insertSort(arr1));
//        quickSort(arr2, 0, 5);
//        for (int n:arr2){
//            System.out.println(n);
//        }

         mergeSort(arr2);
        for (int num:arr2){
            System.out.println(num);
        }

    }

    //冒泡排序
    public static int[] bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    //选择排序
    public static int[] selectSort(int[] arr) {

        int temp, min;
        for (int i = 0; i <= arr.length - 1; i++) {
            min = i;//最小元素的下表
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[min] > arr[j]) j = min;
            }
            if (i != min) {
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

        return arr;
    }

    //插入排序
    public static int[] insertSort(int[] arr) {

        int temp;
        int j;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }
        for (int a : arr) {
            System.out.println(a);
        }
        return arr;
    }

    //快速排序
    public static int Partition(int[] arr, int first, int end) {
        int left = first;
        int ringt = end;
        while (left < ringt) {
            while (left < ringt && arr[left] < arr[ringt]) {
                ringt--;
            }

            if (left < ringt) {
                int temp = arr[left];
                arr[left] = arr[ringt];
                arr[ringt] = temp;
                left++;
            }
            while (left < ringt && arr[left] < arr[ringt]) {
                left++;
            }
            if (left < ringt) {
                int temp = arr[left];
                arr[left] = arr[ringt];
                arr[ringt] = temp;
                ringt--;
            }
        }
        return ringt;
    }
    public static void quickSort(int[] array, int first, int end) {
        if (first < end) {
            int pivot = Partition(array, first, end);    //返回轴值的位置，
            quickSort(array, first, pivot - 1);//第一次排好后，pivot-1就是左侧最尾部的位置
            quickSort(array, pivot + 1, end);    //pivot+1，右侧最开始的位置。
        }
    }
    //归并排序
    public static  void mergeSort(int[] arr){
        int[] temp=new int[arr.length];
        merge_Sort(arr,0,arr.length - 1,temp);
    }
    public static  void merge_Sort(int[] arr,int left,int right,int[] temp){

        if (left<right){
            //将数组进行分割
            int mid = (left + right) / 2;
            //对左子数组继续进行归并排序
            merge_Sort(arr, left, mid, temp);
            //对右子数组继续进行归并排序
            merge_Sort(arr, mid + 1, right, temp);
            //将数组进行合并
            merge(arr, left, mid, right, temp);
        }
    }
    public static void merge(int[] arr, int left, int mid, int right, int[] temp){

        int i=left;
        int j=mid+1;
        int t=0;
        while (i<=mid&&j<=right){
            //当二者都没有到达最后一位时，进行比较并向辅助数组复制
            if (arr[i] < arr[j]) {
                temp[t++] = arr[i++];
            } else {
                temp[t++] = arr[j++];
            }
        }
        //当其中一个数组复制完毕后，将另一个数组内的数组全部复制进辅助数组
        while (i <= mid) {
            temp[t++] = arr[i++];
        }
        while (j <= right) {
            temp[t++] = arr[j++];
        }
        t = 0;
        //将辅助数组内已经排好的数据全部复制进原数组，排序完成
        while (left <= right) {
            arr[left++] = temp[t++];
        }
    }



}
