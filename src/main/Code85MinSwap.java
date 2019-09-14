package main;

import java.util.Arrays;
import java.util.logging.Level;

public class Code85MinSwap {

    public int minSwap(int[] A, int[] B) {

        int[] keep=new int[A.length];
        int[] swap=new int[A.length];
        Arrays.fill(keep,Integer.MAX_VALUE);
        Arrays.fill(swap,Integer.MAX_VALUE);
        swap[0]=1;
        keep[0]=0;
        for (int i = 1; i < A.length; i++) {
            if (A[i]>A[i-1]&&B[i]>B[i-1]){
                swap[i]=swap[i-1]+1;
                keep[i]=keep[i-1];
            }
            if (A[i]>B[i-1]&& B[i]>A[i-1]){
                keep[i]=Math.min(keep[i],swap[i-1]);
                swap[i]=Math.min(swap[i],keep[i-1]+1);
            }

        }
        return Math.min(keep[A.length-1],swap[B.length-1]);
    }
}
