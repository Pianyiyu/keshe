package main;

import java.util.ArrayList;

public class Code79NextLargerNodes {
    public int[] nextLargerNodes(ListNode head) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        ListNode p = head;
        while (p != null) {
            arrayList.add(p.val);
            p = p.next;
        }
        int[] re = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            int max = arrayList.get(i);
            for (int j = i + 1; j < arrayList.size() ; j++) {
                if (arrayList.get(j) > max) {
                    max = arrayList.get(j);
                    break;
                }
            }
            if (max <= arrayList.get(i)) re[i] = 0;
            else re[i] = max;
        }
        return re;

    }
}
