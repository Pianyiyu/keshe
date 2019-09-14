package Sort;

import sun.reflect.generics.tree.Tree;

public class heap {

    public static void main(String[] args) {
//        int[] arr={5,1,3,4,6,4};
        int[] arr={40,10,3,5,1,2};
//        int[] arr={2,5,3,1,10,4};
        int length=arr.length;
//        build_heap(arr,length);
//        heapfy(arr,length,0);
        heap_sort(arr,length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    /**
     * 进行排序 选出对顶元素与最后一个元素交换，“移除”最后一个元素
     * @param tree
     * @param length
     */
    public static void heap_sort(int[] tree,int length){
        build_heap(tree,length);

        for (int i = length-1; i >=0; i--) {
            swap(tree,0,i);
            //堆顶调整
            heapfy(tree,i,0);
        }
    }

    /**
     * 构建堆：从最后一个节点的父节点开始，递减调整堆。父节点的公式为：（i-1）/2
     * @param tree
     * @param length
     */
    public static void build_heap(int[] tree,int length){
        int last_node=length-1;
        for (int i = (last_node-1)/2; i >=0; i--) {
            heapfy(tree,length,i);
        }
    }
    /**
     * 调整堆：完全二叉树  父节点>子节点
     * @param tree  数组
     * @param length  数组长度
     * @param i 节点序号
     */
    public static void heapfy(int[] tree,int length,int i){
        //出口
        if(i>=length)return;
        //左孩子序号
        int c1=2*i+1;
        //右孩子序号
        int c2=2*i+2;
        //最大值序号
        int max=i;
        if (c1<length&&tree[c1]>tree[max]){
            max=c1;
        }
        if (c2<length&&tree[c2]>tree[max]){
            max=c2;
        }
        if (max!=i){
            swap(tree,i,max);
            heapfy(tree,length,max  );
        }
    }

    private static void swap(int[] tree, int i, int max) {
        int temp=tree[i];
        tree[i]=tree[max];
        tree[max]=temp;
    }


}
