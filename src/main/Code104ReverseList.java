package main;

import java.util.List;

//输入:1->2->3->4->5->NULL
//
//        输出:5->4->3->2->1->NULL
public class Code104ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode pre=null;
        ListNode cur=head;
        ListNode next=null;
        while (cur.next!=null){
            next=cur.next;
            cur.next=pre;

            pre=cur;
            cur=next;
        }
        cur.next = pre;
        return cur;
    }
}
