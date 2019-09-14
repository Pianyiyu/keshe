package PDD0403;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class PDD_0403_1 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String a = in.next();
//        int count = in.nextInt();
//
//        if (a.isEmpty()) return;
//        a = a.substring(1, a.length() - 1);
//
//        if (!a.isEmpty()) {
//            String[] chars = a.split(",");
//            int[] arr = new int[chars.length];
//            for (int i = 0; i < chars.length; i++) {
//                arr[i] = Integer.parseInt(chars[i]);
//            }
//            System.out.println(getPro(arr, count));
//        } else return;
//
//
//    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        int a = Integer.parseInt(in.nextLine());
        int b = Integer.parseInt(in.nextLine());
        String[] strings=n.split(" ");
        if (strings.length==10){
            int[] arr=new int[strings.length];
            for (int i = 0; i < strings.length; i++) {
                arr[i]=Integer.parseInt(strings[i]);
            }

            System.out.println(getC(arr,a,b));
        }


    }

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a = Integer.parseInt(in.nextLine());
//        int[] arr = new int[a];
//
//        String n = in.nextLine();
//        String[] strings = n.split(" ");
//        for (int i = 0; i < a; i++) {
//            arr[i] = Integer.parseInt(strings[i]);
//        }
//
//
//        System.out.println(getM(arr));
//
//    }

    public static int getM(int[] arr) {
        int length = arr.length;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                arrayList.add(Math.abs(arr[i] + arr[j]));
            }
        }
        Collections.sort(arrayList);
        return arrayList.get(1) - arrayList.get(0);
    }


    public static int getC(int[] arr, int a, int b) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hashMap.put(i, arr[i]);
        }
        String ca = "";
        String cb = "";
        //选a
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < hashMap.size(); j++) {
                int temp = hashMap.get(j);
                if (temp > 0) {
                    ca += "" + j;
                    hashMap.put(j, temp - 1);
                    break;
                }
            }
        }
        //选B
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < hashMap.size(); j++) {
                int temp = hashMap.get(j);
                if (temp > 0) {
                    cb += "" + j;
                    hashMap.put(j, temp - 1);
                    break;
                }
            }
        }


        return Integer.parseInt(ca) * Integer.parseInt(cb);

    }

    public static double getPro(int[] arr, int stand) {
        int length = arr.length;
        if (arr.length < 2) {
            return 0.000000;
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                arrayList.add(Math.abs(arr[i] - arr[j]));
            }
        }
        int count = 0;
        for (Integer integer : arrayList) {
            if (integer <= stand) count++;
        }

        double re = (double) count / arrayList.size();


        BigDecimal bg = new BigDecimal(re);
        return bg.setScale(6, BigDecimal.ROUND_UP).doubleValue();

    }
}
