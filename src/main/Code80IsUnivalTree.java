package main;

import java.util.LinkedList;
import java.util.Queue;

public class Code80IsUnivalTree {
    public boolean isUnivalTree(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        if (root==null) return true;
        int re=root.val;
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode temp=queue.poll();
            if (temp.val!=re) return false;
            if (temp.left!=null)queue.offer(temp.left);
            if (temp.right!=null)queue.offer(temp.right);
        }
        return  true;
    }
}
