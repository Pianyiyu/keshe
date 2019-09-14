package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Code111MinDiffInBST {

    public static void main(String[] args) {
        TreeNode treeNode=new TreeNode(4);
        TreeNode treeNode2=new TreeNode(2);
        TreeNode treeNode3=new TreeNode(6);
        TreeNode treeNode4=new TreeNode(1);
        TreeNode treeNode5=new TreeNode(3);

        treeNode.left=treeNode2;
        treeNode.right=treeNode3;
        treeNode2.left=treeNode4;
        treeNode2.right=treeNode5;

        System.out.println(minDiffInBST(treeNode));

    }

    public static int minDiffInBST(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        dfs(root,list);
        if (list.size()==0)return 0;
        Collections.sort(list);
        for (int i = 1; i < list.size(); i++) {
            min=Math.min(min,list.get(i)-list.get(i-1));
        }
        return min;
    }

    public static void dfs(TreeNode root,List<Integer> list){
        if (root==null) return;
        list.add(root.val);
        dfs(root.left,list);
        dfs(root.right,list);

    }
}
