package WeBank;

import com.sun.org.apache.regexp.internal.RE;

//这天，阳阳和他的小伙伴们一起玩游戏！
//        他们总共有n个人，排成一圈，然后从第一个人开始依次报数，1，2，3，....,
//        报到m的人退出游戏，然后从下一个人开始重新从1报数，重复这个过程，直到只剩下一个人时，此人就是游戏的获胜者
//55%
import java.util.*;

public class Main3 {
    static class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        List<Integer> list = new ArrayList<>();
        ListNode head = null;
        ListNode p = null;
        for (int i = 0; i < n; i++) {
            if (head == null) {
                ListNode listNode = new ListNode(i + 1);
                head = listNode;
                p = head;
            } else {
                ListNode listNode = new ListNode(i + 1);
                p.next = listNode;
                p = p.next;
            }
        }
        p.next = head;
        int re = quan(head, list, m);
        if (list.isEmpty())
            System.out.println();
        else {
            for (Integer integer : list) {
                System.out.print(integer);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println(re);
    }

    public static int quan(ListNode head, List<Integer> list, int m) {
        ListNode pre = head, cur = head, next = cur.next;
        while (pre.next != head) {
            pre = pre.next;
        }
        int i = 1;
        while (i <= m) {
            if (pre == cur && cur == next) break;
            if (i == m) {
                list.add(cur.val);
                pre.next = cur.next;
                cur.next = null;
                cur = next;
                next = next.next;
                i = 1;
            }else {
                pre = cur;
                cur = next;
                next = next.next;
                i++;
            }
        }
        return cur.val;
    }



}
