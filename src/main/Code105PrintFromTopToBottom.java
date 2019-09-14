package main;

import java.util.*;

//请实现一个函数按照之字形顺序从上向下打印二叉树。
//
//即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
public class Code105PrintFromTopToBottom {

    public List<List<Integer>> printFromTopToBottom(TreeNode root) {
        List<List<Integer>> arr = new ArrayList<>();
        if(root==null)
            return arr;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);

        while(!stack1.empty()||!stack2.empty()){
            if(!stack1.empty()){
                ArrayList<Integer> arr1 = new ArrayList<>();
                while(!stack1.empty()){
                    TreeNode node = stack1.pop();
                    arr1.add(node.val);
                    if(node.left!=null)
                        stack2.push(node.left);
                    if(node.right!=null)
                        stack2.push(node.right);
                }
                arr.add(arr1);
            }
            else{
                ArrayList<Integer> arr1 = new ArrayList<>();
                while(!stack2.empty()){
                    TreeNode node = stack2.pop();
                    arr1.add(node.val);
                    if(node.right!=null)
                        stack1.push(node.right);
                    if(node.left!=null)
                        stack1.push(node.left);
                }
                arr.add(arr1);
            }
        }
        return arr;
    }
}
