package ZhaoShang0409;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            System.out.println(answer(a));
        //}
    }
//    public static int ans(int num){
//        if (num==0)return 1;
////        if (num==1)return 1;
//        return ans(num-1)+1;
//    }

    public static int answer(int num){
        int temp=num-6;
        if (temp<0)return 0;
        if (temp==0)return 1;
        int count=0;
//        while (temp>=0){
//            count+=ans(temp--);
//        }
//        return count;
        return (int) Math.pow(2,temp-1);
    }
}
