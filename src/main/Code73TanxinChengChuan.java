package main;

import java.util.Arrays;

public class Code73TanxinChengChuan {
    public static void main(String[] args) {

        int[] arr={1,5,3,5};
        System.out.println(numRescueBoats(arr,7));

    }
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int length = people.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (people[i] + people[length - 1] > limit && i != length - 1) {
                count++;
                length -= 1;
                i--;
            } else {
                count++;
                length -= 1;
            }
        }
        return count;
    }

//    public int numRescueBoats(int[] people, int limit) {
//        Arrays.sort(people);
//        int i=0,j=people.length-1;
//        int ans=0;
//        while(i<=j)
//        {
//            ans++;
//            if(people[i]+people[j]<=limit)
//                i++;
//            j--;
//        }
//        return ans;
//    }


}
