package ZhaoShang0409;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
        int people = in.nextInt();
        int rongliang = in.nextInt();
        //}
        double[] arr=new double[people];
        for (int i = 0; i < people; i++) {
            arr[i]=in.nextInt();
        }

        String result = String .format("%.6f",ro(arr,people));
        System.out.println(result);
        System.out.println(Double.parseDouble(result));
        System.out.printf("%.6f",ro(arr,people));
//        BigDecimal bg = new BigDecimal(ro(arr,people));
//
//        System.out.print(bg.setScale(6, RoundingMode.HALF_UP).doubleValue());
       // System.out.println(ro(arr,people));


    }
    public static double ro(double[] arr,int people){
        Arrays.sort(arr);
        double min=arr[0];
        double mid=arr[(arr.length-1)/2];
        if (mid>=2*min)return 3.0*min*people;else {
            return (mid/2+mid)*people;
        }

    }
}
