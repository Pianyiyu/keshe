package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Code47BFS {


    //bfs
    public ArrayList<Integer> BFS(TreeNode root) {
        ArrayList<Integer> lists = new ArrayList<Integer>();
        if (root == null)
            return lists;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode tree = queue.poll();
            if (tree.left != null)
                queue.offer(tree.left);
            if (tree.right != null)
                queue.offer(tree.right);
            lists.add(tree.val);
        }
        return lists;
    }


    //dfs
    public ArrayList<Integer> DFS(TreeNode root) {
        ArrayList<Integer> lists = new ArrayList<Integer>();
        if (root == null)
            return lists;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode tree = stack.pop();
//先往栈中压入右节点，再压左节点，这样出栈就是先左节点后右节点了。
            if (tree.right != null)
                stack.push(tree.right);
            if (tree.left != null)
                stack.push(tree.left);
            lists.add(tree.val);
        }
        return lists;
    }
}
