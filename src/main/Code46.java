package main;

import java.util.Scanner;

public class Code46 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] arr = new String[n];
        if (n>0){
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.next();
                // System.out.println(arr[i].substring(0, 2));
            }
            jiaoyan(arr);
            for (String s : arr) {
                System.out.println(s);
            }
        }



    }

    public static void jiaoyan(String[] arr) {
        if (arr.length <= 0) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            char[] chars = arr[i].toCharArray();
            if (arr[i].length() >= 3) {
                for (int j = 0; j <= arr[i].length() - 3;j++) {
                    int k=j;
                    if (chars[k] == chars[k + 1] && chars[k + 1] == chars[k + 2]) {
                        arr[i] = arr[i].substring(0, k ) + arr[i].substring(k + 1, arr[i].length());
                        //System.out.println(arr[i]);

                    }
                }
            }
            if (arr[i].length() >= 3) {
                for (int j = 0; j <= arr[i].length() - 3;j++) {
                    int k=j;
                    if (chars[k] == chars[k + 1] && chars[k + 1] == chars[k + 2]) {
                        arr[i] = arr[i].substring(0, k ) + arr[i].substring(k + 1, arr[i].length());
                        //System.out.println(arr[i]);

                    }
                }
            }
            if (arr[i].length() >= 4) {
                for (int j = 0; j <= arr[i].length() - 4; j++) {
                    if (chars[j] == chars[j + 1] && chars[j + 2] == chars[j + 3]) {
                        arr[i] = arr[i].substring(0, j + 3) + arr[i].substring(j + 4, arr[i].length());
                        // System.out.println(arr[i]);
                    }
                }
            }
//
            if (arr[i].length() >= 6) {
                for (int j = 0; j <= arr[i].length() - 6; j++) {
                    if (chars[j] == chars[j + 1] && chars[j + 2] == chars[j + 3] && chars[j + 4] == chars[j + 5]) {
                        arr[i] = arr[i].substring(0, j + 1) + arr[i].substring(j + 2, arr[i].length());
                        //System.out.println(arr[i]);
                    }
                }
            }


        }


    }
}
