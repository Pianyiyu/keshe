package main;

//给定一个二叉树，判断其是否是一个有效的二叉搜索树。
//
//        假设一个二叉搜索树具有如下特征：
//
//        节点的左子树只包含小于当前节点的数。
//        节点的右子树只包含大于当前节点的数。
//        所有左子树和右子树自身必须也是二叉搜索树。
//        示例 1:
//
//        输入:
//        2
//        / \
//        1   3
//        输出: true
//        示例 2:
//
//        输入:
//        5
//        / \
//        1   4
//        / \
//        3   6
//        输出: false
//        解释: 输入为: [5,1,4,null,null,3,6]。
//        根节点的值为 5 ，但是其右子节点值为 4 。
//中序递归
public class Code112IsValidBST {
    double pre = -Double.MAX_VALUE;
    boolean flag=true;
    public boolean isValidBST(TreeNode root) {
        midOrder(root);
        return flag;
    }

    //中序递归实现
    public void midOrder(TreeNode root){
        if(root!=null){
            midOrder(root.left);
            if(pre>=root.val){
                flag=false;          //前一个值与后一个值进行比较
                return;
            }else{
                pre=root.val;       //pre记录中序遍历前一个的值
            }
            midOrder(root.right);
        }
    }
}
