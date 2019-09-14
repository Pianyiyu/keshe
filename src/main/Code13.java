package main;


import java.util.HashMap;
import java.util.Map;

//输入一个链表，输出该链表中倒数第k个结点。
public class Code13 {

    public ListNode FindKthToTail(ListNode head, int k) {
        Map<Integer,ListNode> map= new  HashMap<Integer,ListNode>();
        int count=0;
        while (head!=null){
            count+=1;
            map.put(count,head);
            head=head.next;
        }
        return map.get(count+1-k);
    }
}
