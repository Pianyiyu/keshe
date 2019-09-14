package Tengxun0405;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor;

public class Main2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int m = Integer.parseInt(scanner.nextLine());
        int[] wuli=new int[m];
        int[] money=new int[m];
        for (int i = 0; i < m; i++) {
            wuli[i]=scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            money[i]=scanner.nextInt();
        }
        System.out.println(leastMoney(wuli,money,0,0));
    }
    public static int leastMoney(int[] weight,int[] money,int energy,int i){
        int value=0;
        if (i==weight.length-1){
            if (energy>weight[i])
                return 0;
            else
                return value+money[i];
        }
        if (i==weight.length)return 0;
        if (energy<weight[i]){
            value=leastMoney(weight,money,energy+weight[i],i+1)+money[i];
        }else{
            value= Math.min(leastMoney(weight,money,energy+weight[i],i+1)+money[i],
                        leastMoney(weight,money,energy,i+1));
        }
        return value;
    }


//    public static int leastMoney_(int[] weight,int[] money,int energy,int n) {
////        if (n == 0) return money[0];
//
////        for (int i = n - 1; i >= 0; i--) {
////            if (energy < weight[i]) {
////                v = leastMoney(weight, money, energy + weight[i], i, v + money[i]);
////            } else {
////                v = Math.min(leastMoney(weight, money, energy + weight[i], i, v + money[i]),
////                        leastMoney(weight, money, energy, i - 1, v));
////            }
////        }
//        int v=0;
//        if (n==weight.length) return 0;
//        for (int i = n; i <weight.length; i++) {
//            if (energy<weight[i]){
//                v=leastMoney_(weight,money,energy+weight[i],n+1)+money[i];
//            }else
//                v=Math.min(money[i]+leastMoney_(weight,money,energy,n+1),leastMoney_(weight,money,energy+weight[i],n+1));
//        }
//        return v;
//    }


}
