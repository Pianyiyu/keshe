package main;

import java.util.Scanner;

public class Code1 {
//    在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
//    每一列都按照从上到下递增的顺序排序。'
//    请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//创建键盘录入的对象
        System.out.println("二维数组");
        int aa=sc.nextInt();
        System.out.println("请输课程数");
        int ss=sc.nextInt();//存储录入的数据
        int [][] array=new int[aa][aa];
        int sum=0;
        for (int i=0;i<aa;i++){
            for (int j=0;j<aa;j++){
                array[i][j]=sum;
                sum++;
            }
        }
        System.out.println(Find(ss,array));
    }

    public static boolean Find(int target, int [][] array) {
        boolean flag=false;
        int a=0;//行
        int b=array[0].length-1;//列
        for (;;){
            if (b<0||a>array.length-1){
                flag=false;
                break;
            }
            if (target>array[a][b]){
                a=a+1;
            }else if (target<array[a][b]){
                b=b-1;
            }else{
                flag=true;
                break;
            }
        }
        return  flag;
    }
}
