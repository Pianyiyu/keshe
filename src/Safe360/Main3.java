package Safe360;

import javax.swing.tree.TreeNode;
import java.util.*;

public class Main3 {
    public static class TreeNode{
        TreeNode left;
        TreeNode right;
        int value;
        TreeNode(int value){
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cen = in.nextInt();
        int[] arr = new int[(int) Math.pow(2, cen) - 1];
        for (int i = 0; i < (int) Math.pow(2, cen) - 1; i++) {
            arr[i] = in.nextInt();
        }
        int re1 = in.nextInt();
        int re2 = in.nextInt();

        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            s.push(arr[i]);
        }
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(s.pop());
        queue.offer(root);
        while (!s.isEmpty() && !queue.isEmpty()){
             TreeNode temp = queue.poll();
             int left = s.pop();
             int right = s.pop();
             if (left != -1){
                 TreeNode treeNode = new TreeNode(left);
                 temp.left = treeNode;
                 queue.offer(treeNode);
             }else {
                 temp.left = null;
             }
            if (right != -1){
                TreeNode treeNode = new TreeNode(right);
                temp.right = treeNode;
                queue.offer(treeNode);
            }else {
                temp.right = null;
            }
        }

        TreeNode lcs = lcs(root, new TreeNode(re1), new TreeNode(re2));
        System.out.println(lcs.value);

    }
    public static TreeNode lcs(TreeNode root ,TreeNode v1,TreeNode v2){
        if (root == null || root == v1 || root == v2){
            return root;
        }
        TreeNode left = lcs(root.left , v1, v2);
        TreeNode right = lcs(root.right , v1, v2);
        if (left != null && right != null){
            return root;
        }
        return left == null ? right : left;
    }
}
