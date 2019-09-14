package main;
//给定一个链表（链表结点包含一个整型值）的头结点 head。
//
//        同时给定列表 G，该列表是上述链表中整型值的一个子集。
//
//        返回列表 G 中组件的个数，这里对组件的定义为：链表中一段最长连续结点的值（该值必须在列表 G 中）构成的集合。
//
//        示例 1：
//
//        输入:
//        head: 0->1->2->3
//        G = [0, 1, 3]
//        输出: 2
//        解释:
//        链表中,0 和 1 是相连接的，且 G 中不包含 2，所以 [0, 1] 是 G 的一个组件，同理 [3] 也是一个组件，故返回 2。
//        示例 2：
//
//        输入:
//        head: 0->1->2->3->4
//        G = [0, 3, 1, 4]
//        输出: 2
//        解释:
//        链表中，0 和 1 是相连接的，3 和 4 是相连接的，所以 [0, 1] 和 [3, 4] 是两个组件，故返回 2。
//        注意:
//
//        如果 N 是给定链表 head 的长度，1 <= N <= 10000。
//        链表中每个结点的值所在范围为 [0, N - 1]。
//        1 <= G.length <= 10000
//        G 是链表中所有结点的值的一个子集.

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.CheckedOutputStream;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class Code38 {
    //        head: 0->1->2->3
//        G = [0, 1, 3]
    public static void main(String[] args) {
        int[] G={4};
        ListNode p1=new ListNode(3);
        ListNode p2=new ListNode(4);
        ListNode p3=new ListNode(0);
        ListNode p4=new ListNode(2);
        ListNode p5=new ListNode(1);
        p1.next=p2;
        p2.next=p3;
        p3.next=p4;
        p4.next=p5;
        p5.next=null;

        System.out.println(numComponents(p1,G));


    }

    public static int numComponents(ListNode head, int[] G) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < G.length; i++) {
            map.put(i, G[i]);
        }
        ListNode p = head;
        boolean bl =false;
        int count = 0;
        while (p != null) {
            if (map.containsValue(p.val)) {
                bl = true;
            } else {
                if (bl == true) count+=1;
                bl = false;
            }
            p = p.next;
        }
        if (bl == true) count += 1;
        return count;
    }
}
