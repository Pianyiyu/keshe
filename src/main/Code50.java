package main;

import java.util.LinkedList;

//给定一个单链表 L：L0→L1→…→Ln-1→Ln ，
//        将其重新排列后变为： L0→Ln→L1→Ln-1→L2→Ln-2→…
//
//        你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
//
//        示例 1:
//
//        给定链表 1->2->3->4, 重新排列为 1->4->2->3.
//        示例 2:
//
//        给定链表 1->2->3->4->5, 重新排列为 1->5->2->4->3.
public class Code50 {


    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(3);
        ListNode l4=new ListNode(4);
        ListNode l5=new ListNode(5);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        l5.next=null;

        LinkedList<ListNode> queue=new LinkedList<>();
        ListNode cur = l1;
        while (cur != null) {
            queue.addLast(cur);
            cur = cur.next;
        }

        while (!queue.isEmpty()){
            System.out.println(queue.pollFirst().val);
        }


    }





    public void reorderList(ListNode head) {
        LinkedList<ListNode> queue = new LinkedList<>();
        ListNode cur = head;
        while (cur != null) {
            queue.addLast(cur);
            cur = cur.next;
        }

        while (!queue.isEmpty()) {
            if (cur == null) {
                cur = queue.pollFirst();
            } else {
                cur.next = queue.pollFirst();
                cur = cur.next;
            }
            cur.next = queue.pollLast();
            cur = cur.next;
        }
        if (cur != null) {
            cur.next = null;
        }
    }
}
