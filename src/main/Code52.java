package main;


import javax.sound.midi.Soundbank;

//链表反转
public class Code52 {

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

//        ListNode a= reverseNode(l1);
        ListNode a= reversetwoNode(l1);
        while (a!=null){
            System.out.println(a.val);
            a=a.next;
        }
    }

//反转链表
    public static ListNode reverseNode(ListNode head){
        if (head==null) return null;
        if (head.next==null) return head;
        ListNode p=head;
        ListNode q=head.next;
        head.next=null;
        ListNode r=null;
        while (q!=null){
            r=q.next;
            q.next=p;
            p=q;
            q=r;
        }
        head=p;
        return head;
    }
    //两两交换
    public static ListNode reversetwoNode(ListNode head){
//        ListNode temp=new ListNode(-1);
//        temp.next=head;
//        ListNode p=head;
//        ListNode q=head.next;
//        ListNode pre=temp;
//        while (pre.next!=null&&pre.next.next!=null){
//            p.next=q.next;
//            pre.next=q;
//            pre=pre.next.next;
//            p=pre.next.next;
//            q=q.next.next;
//        }
//        return head;

        if (head == null || head.next == null) {//特殊情况处理，节点数量小于2
            return head;
        }
        ListNode root = new ListNode(0);//必须定义一个根节点，从而记住最后链表的头部
        root.next = head;//自定义节点next与链表链接上
        ListNode pre = root;//需要一个节点记住，发生交换前，上一次交换的末尾节点索引点

        while (pre.next != null && pre.next.next != null) {//下一次交换的下一个节点，下下个节点都不为空才能交换
            ListNode start = pre.next;//定义下一次交换的第一个节点
            ListNode then = pre.next.next;//定义下一次交换的第二个节点
            //第一个和第二个节点位置交换
            //这里有个必须注意的是，链表位置交换，比如1->2->3->4->5，这个链表，2和3要交换。执行交换操作就是
            //1先指向3，然后2执行4，最后3指向2,这样就链接起来了。
            pre.next = then;
            start.next = then.next;
            then.next = start;

            pre = start;//最后更新下一次交换前的上个节点node
        }
        return root.next;
    }
}
