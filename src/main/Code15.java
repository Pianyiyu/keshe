package main;

import com.sun.scenario.effect.Merge;

//输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
public class Code15 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = null;
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(2);
        ListNode node6 = new ListNode(4);
        ListNode node7 = new ListNode(5);
        ListNode node8 = new ListNode(6);
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = null;

        ListNode node = Merge(node1, node4);

        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }


    }

    public static ListNode Merge(ListNode list1, ListNode list2) {
        //递归
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val <= list2.val) {
            list1.next = Merge(list1.next, list2);
            return list1;
        } else {
            list2.next = Merge(list1, list2.next);
            return list2;
        }


        //非递归
//        if(list1 == null){
//            return list2;
//        }
//        if(list2 == null){
//            return list1;
//        }
//        ListNode mergeHead = null;
//        ListNode current = null;
//        while(list1!=null && list2!=null){
//            if(list1.val <= list2.val){
//                if(mergeHead == null){
//                    mergeHead = current = list1;
//                }else{
//                    current.next = list1;
//                    current = current.next;
//                }
//                list1 = list1.next;
//            }else{
//                if(mergeHead == null){
//                    mergeHead = current = list2;
//                }else{
//                    current.next = list2;
//                    current = current.next;
//                }
//                list2 = list2.next;
//            }
//        }
//        if(list1 == null){
//            current.next = list2;
//        }else{
//            current.next = list1;
//        }
//        return mergeHead;
    }
}
