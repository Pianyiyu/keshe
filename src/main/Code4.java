package main;

//输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
// 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Code4 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return re(pre,0,pre.length-1,in,0,in.length-1);
    }
    public TreeNode re(int [] pre,int startpre,int endpre,int[] in,int startin,int endin){
        if (startpre>endpre){
            return  null;
        }
        TreeNode root=new TreeNode(pre[startpre]);
        for (int i = startin; i <=endin ; i++) {
            if (in[i]==pre[startpre]){
                root.left=re(pre,startpre+1,startpre+i-startin,in,startin,i-1);
                root.right=re(pre,i-startin+startpre+1,endpre,in,i+1,endin);
                break;
            }
        }
        return root;
    }
}
