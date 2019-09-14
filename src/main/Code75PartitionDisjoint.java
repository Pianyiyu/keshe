package main;
//输入：[1,1,1,0,6,12]
// 输出：4
// 解释：left = [1,1,1,0]，right = [6,12]
public class Code75PartitionDisjoint {
    public int partitionDisjoint(int[] A) {
        //left中最大的数
        int lmax=A[0];
        //记录游走过的最大值
        int maxv = A[0];
        //left的下标
        int left=0;
        for (int i = 0; i < A.length; i++) {
            if (A[i]<lmax){
                lmax=maxv;
                left=i;
            }else if (A[i]>maxv)
                maxv=A[i];
        }
        return left+1;

    }
}
