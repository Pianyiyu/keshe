package main;

import java.util.LinkedList;
import java.util.Queue;

//输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，
//        最长路径的长度为树的深度。
public class Code62 {

    public static int dg_TreeDepth(TreeNode root) {

        if (root == null) return 0;
        return Math.max(dg_TreeDepth(root.left) + 1, dg_TreeDepth(root.right) + 1);
    }


    public static int TreeDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0, count = 0, nextCount = 1;
        while (queue.isEmpty()) {
            TreeNode temp = queue.poll();
            count++;
            if (temp.left != null)
                queue.offer(temp.left);
            if (temp.right != null)
                queue.offer(temp.right);
            System.out.println(temp.val);

            if(count == nextCount){
                nextCount = queue.size();
                count = 0;
                depth++;
            }
        }
        return depth;
    }
}
