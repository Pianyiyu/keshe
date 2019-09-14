package JingDong;

import learn.huidiao.Ricky;

import java.util.*;

//体育场突然着火了，现场需要紧急疏散，但是过道真的是太窄了，
//        同时只能容许一个人通过。现在知道了体育场的所有座位分布，
//        座位分布图是一棵树，已知每个座位上都坐了一个人，安全出口在树的根部，
//        也就是1号结点的位置上。其他节点上的人每秒都能向树根部前进一个结点，
//        但是除了安全出口以外，没有任何一个结点可以同时容纳两个及以上的人，
//        这就需要一种策略，来使得人群尽快疏散，问在采取最优策略的情况下，体育场最快可以在多长时间内疏散完成。
public class Main1 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        TreeNode[] treeNodes=new TreeNode[count+1];
        for (int i = 0; i < treeNodes.length; i++) {
            TreeNode treeNode=new TreeNode(i);
            treeNodes[i]=treeNode;
        }
        for (int i = 1; i <count; i++) {
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            if (treeNodes[b].left==null)
                treeNodes[b].left=treeNodes[a];
            else
                treeNodes[b].right=treeNodes[a];
        }
        System.out.println(Math.max(bfs(treeNodes[1].right),bfs(treeNodes[1].left)));
    }

    public static int bfs(TreeNode root){
        if (root==null) return 0;
        LinkedList<TreeNode> list=new LinkedList<>();
        list.offer(root);
        int count=0;
        while (!list.isEmpty()){
            TreeNode temp= list.pop();
            count++;
            if (temp.left!=null) list.offer(temp.left);
            if (temp.right!=null)list.offer(temp.right);
        }
        return count;
    }

}
