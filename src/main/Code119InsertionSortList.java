package main;

import javafx.beans.binding.When;

//链表进行插排
public class Code119InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode res=new ListNode(-1);
        res.next=head;
        ListNode idx =head;
        ListNode cur=head.next;
        while (cur!=null){
            ListNode next=cur.next;
            if (cur.val>= idx .val){
                idx =cur;
                cur=next;
                continue;
            }
            //每次循环将pre重置到dummy节点
            ListNode pre = res;
            while (pre.next != null && pre != idx && pre.next.val < cur.val)
                pre = pre.next;
            //cur 插入到 pre 与 pre.next中间
            cur.next = pre.next;
            pre.next = cur;
            //idx 指向next
            idx.next = next;
            //向后移动cur
            cur = next;
        }

        return res.next;

    }
}
