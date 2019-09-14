package main;

import java.util.ArrayList;
import java.util.Stack;
//输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}


public class Code3 {

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
        Solution solution=new Solution();
        ArrayList<Integer> arrayList=solution.printListFromTailToHead(node1);
        System.out.println(arrayList);
    }

    public static class Solution {
        public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
            ArrayList<Integer> arrayList=new ArrayList<>();
            Stack<Integer> stack=new Stack();
            while (listNode!=null){
                stack.push(listNode.val);
                listNode=listNode.next;
            }
            while (!stack.isEmpty()){
                arrayList.add(stack.pop());
            }
            return arrayList;
        }
    }
}
