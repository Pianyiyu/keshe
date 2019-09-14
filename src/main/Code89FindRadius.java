package main;

import java.io.File;
import java.util.Arrays;

public class Code89FindRadius {

    public static void main(String[] args) {

        int a=10;
        long b=(long) a;
        long b1=10;
        int a1=(int)b1;
        System.out.println(a1);
    }


    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int res=0;
        for (int i:houses)
        {
            int index=Arrays.binarySearch(heaters,i);
            if(index>=0)continue;
            int left=-index-2;
            int right=-index-1;
            //房间在热水器的左边
            if(left<0)res=Math.max(res,heaters[right]-i);
            //房间在热水器的右边
            else if(right==heaters.length)res=Math.max(res,i-heaters[left]);
            //房间在热水器的中间
            else res=Math.max(res,Math.min(i-heaters[left],heaters[right]-i));
        }
        return res;
    }
}
