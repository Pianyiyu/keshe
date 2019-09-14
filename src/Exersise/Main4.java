package Exersise;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2=scanner.nextLine();
        System.out.println(maxPubSub(s1,s2));
    }
    public static int maxPubSub(String s1,String s2){
        int a=0;int maxlen=0;
        while (a<s2.length()){
            int j=a;
            for (int i = 0; j < s2.length(); i++,j++) {
                if (s1.contains(s2.substring(i,j+1))){
                    if (maxlen<j-i+1)maxlen=j-i+1;
                }
            }
            a++;
        }
        return maxlen;
    }



//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()){
//            String s1 = sc.nextLine();
//            String s2 = sc.nextLine();
//            int l1 = s1.length();
//            int l2 = s2.length();
//            int result = 0;
//            int[][] dp = new int[l1 + 1][l2 + 1];
//            for (int i = 1; i <= l1; i++){
//                for (int j = 1; j <= l2; j++){
//                    if (s1.charAt(i - 1) == s1.charAt(j - 1)){
//                        dp[i][j] = dp[i - 1][j - 1] + 1;
//                        result = Math.max(dp[i][j], result);
//                    }
//                    else{
//                        dp[i][j] = 0;
//                    }
//                }
//            }
//            System.out.println(result);
//        }
//        sc.close();
//    }
}
