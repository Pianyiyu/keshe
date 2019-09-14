package main;

import java.util.HashMap;
import java.util.Map;

//输入一个链表，反转链表后，输出新链表的表头。
public class Code14 {


    public static void main(String[] args) {
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        ListNode node5=new ListNode(5);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=null;

        ListNode node=ReverseList(node1);
        while (node!=null){
            System.out.println(node.val);
            node=node.next;
        }

    }
    public static ListNode ReverseList(ListNode head) {
        if (head==null){
            return null;
        }
        int count=0;
        ListNode node_=head;
        Map<Integer,ListNode> map=new HashMap<>();
        while (head!=null){
            count+=1;
            map.put(count,head);
            head=head.next;
        }
        ListNode headNode=null;
        ListNode preNode=null;
        for (int i=map.size();i>=1;i--){
            if (headNode==null){
                headNode=map.get(i);
                preNode=headNode;
                continue;
            }
            ListNode nextNode=map.get(i);
            preNode.next=nextNode;
            preNode=nextNode;
        }
        preNode.next=null;
        return headNode;
    }
}
