package main;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//您需要在二叉树的每一行中找到最大的值。
//
//        示例：
//
//        输入:
//
//         1
//        / \
//       3   2
//      / \   \
//     5   3   9
//
//        输出: [1, 3, 9]
public class Code23 {

    //运用了广度优先搜索---按层遍历（队列）
    //深度优先搜索--按深度遍历（栈）
    public List<Integer> largestValues(TreeNode root) {
        if(root==null) return null;
        List<Integer> list =new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        int max;
        queue.offer(root);
        while (!queue.isEmpty()){
            int size=queue.size();
            max=queue.peek().val;
            while (size>0){
                TreeNode temNode=queue.poll();
                if (max<temNode.val)max=temNode.val;
                if (temNode.left!=null)queue.offer(temNode.left);
                if (temNode.right!=null)queue.offer(temNode.right);
                size--;
            }
            list.add(max);
        }
        return list;
    }
}
