package main;

import com.sun.org.apache.bcel.internal.generic.ALOAD;

//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
//        所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
public class Code59 {

    public void reOrderArray(int [] array) {


        for(int i=1;i<array.length;i++){
            int target = array[i];
            if(array[i] % 2 == 1){
                int j = i;
                while(j >= 1 && array[j-1] % 2 == 0){
                    array[j] = array[j-1];
                    j--;
                }
                array[j] = target;
            }
        }
    }


    public ListNode FindKthToTail(ListNode head,int k) {
        if (head==null||k<=0)return null;
        ListNode slow=head;
        ListNode fast=head;
        for (int i = 0; i < k - 1; i++) {
            if (fast!=null)
                fast=fast.next;
            else
                return null;
        }
        while (fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;

    }
}
