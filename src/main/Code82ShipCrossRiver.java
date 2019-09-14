package main;

import java.util.Arrays;
//        1.让最快的和最慢的乘船过河，然后最快的乘船回来，再让最快的和第二慢的一同乘船过河，之后最快的乘船回来（再去接更多的人~）这是最常想到的方法，也是解法相对最优的情况，花费时间2*time[0]+time[n-2]+time[n-1](下标从0开始，所以数组中n-1代表第n个）
//
//        还有一种方法也是最优解的有力竞争~
//
//        2.先让最快的和较快的乘船过去，接着最快的乘船回来，再让最慢的和第二慢的乘船过去，较快的乘船回来，这是第二种方式（从情理上来讲相对合理，因为第一种的话最快的太累了，哈哈）这种方法花费的时间time[0]+2*time[1]+time[n-1]

public class Code82ShipCrossRiver {

    public static int shipCrossRiver(int[] arr){
        Arrays.sort(arr);
        int length=arr.length;
        int count=0;
        while (length>3){
            count+=Math.min(arr[length-1]+arr[0]+arr[length-2]+arr[0],arr[length-1]+arr[1]+arr[0]+arr[1]);
            length-=2;
        }
        if (length==3){
            count+=(arr[0]+arr[1]+arr[2]);
        }
        if (length==2){
            count+=(arr[1]);
        }
        if (length==1){
            count+=arr[0];
        }
        return count;

    }
}
