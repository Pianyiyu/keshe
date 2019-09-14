package main;

import java.util.LinkedList;
import java.util.Queue;

//给定一个链表，判断链表中是否有环。
//
//        为了表示给定链表中的环，
//        我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
public class Code49 {


    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast.next != null && fast.next.next != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow == fast;
    }

    //    给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
//
//    为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
//
//    说明：不允许修改给定的链表。
//
//
//
//    示例 1：
//
//    输入：head = [3,2,0,-4], pos = 1
//    输出：tail connects to node index 1
//    解释：链表中有一个环，其尾部连接到第二个节点。
//
//
//    示例 2：
//
//    输入：head = [1,2], pos = 0
//    输出：tail connects to node index 0
//    解释：链表中有一个环，其尾部连接到第一个节点。
//
//
//    示例 3：
//
//    输入：head = [1], pos = -1
//    输出：no cycle
//    解释：链表中没有环。
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        boolean hascycle=false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                hascycle=true;
                break;
            }
        }

        if (hascycle){
            ListNode q = head;
            while (slow != q) {
                slow= slow.next;
                q = q.next;
            }
            return q;
        }else {
            return null;
        }
    }
}
