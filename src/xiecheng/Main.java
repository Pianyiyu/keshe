package xiecheng;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /*请完成下面这个函数，实现题目要求的功能
     ******************************开始写代码******************************/
    static ListNode partition(ListNode head,int m) {
        if (head == null){
            return null;
        }
        List<Integer> min = new ArrayList<>();
        List<Integer> max = new ArrayList<>();
        ListNode temp = head;
        while (temp != null){
            if (temp.val > m){
                max.add(temp.val);
            }else {
                min.add(temp.val);
            }
            temp = temp.next;
        }
        min.addAll(max);
        ListNode root=null;
        ListNode p=null;
        for(Integer integer : min){
            if(root==null){
                p=new ListNode(integer);
                root=p;
            }else{
                p.next=new ListNode(integer);
                p=p.next;
            }
        }
        return root;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ListNode head=null;
        ListNode node=null;
        int m=in.nextInt();
        while(in.hasNextInt()){
            int v=in.nextInt();
            if(head==null){
                node=new ListNode(v);
                head=node;
            }else{
                node.next=new ListNode(v);
                node=node.next;
            }
        }
        head= partition(head,m);
        if(head!=null){
            System.out.print(head.val);
            head=head.next;
            while(head!=null){
                System.out.print(",");
                System.out.print(head.val);
                head=head.next;
            }
        }
        System.out.println();
    }
}
