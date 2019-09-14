package main;

import java.util.ArrayList;

//给定一个整数 n，求以 1 ... n 为节点组成的二叉搜索树有多少种？
//
//        示例:
//
//        输入: 3
//        输出: 5
//        解释:
//        给定 n = 3, 一共有 5 种不同结构的二叉搜索树:
//
//        1         3     3      2      1
//        \       /     /      / \      \
//        3     2     1      1   3      2
//        /     /       \                 \
//        2     1         2                 3
public class Code53 {

    public int numTrees(int n) {
        if (n == 0)return 0;
        if (n == 1) return 1;
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            for (int j = 0; j < i; j++) {
                arr[i] = arr[i] + arr[j] * arr[i - j - 1];
            }
        }
        return arr[n];
    }

    //输出排列
    private ArrayList<TreeNode> generate(int start, int end){
        ArrayList<TreeNode> rst = new ArrayList<TreeNode>();
        if(start > end){
            rst.add(null);
            return rst;
        }
        for(int i=start; i<=end; i++){
            ArrayList<TreeNode> left = generate(start, i-1);
            ArrayList<TreeNode> right = generate(i+1, end);
            for(TreeNode l: left){
                for(TreeNode r: right){
                    TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    rst.add(root);
                }
            }
        }
        return rst;
    }


}
