package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//从上往下打印出二叉树的每个节点，同层节点从左至右打印
public class Code68 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        if (root == null)
            return arrayList;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            arrayList.add(temp.val);
            if (temp.left != null)
                queue.offer(temp.left);
            if (temp.right != null)
                queue.offer(temp.right);
        }
        return arrayList;
    }
}
