package main;

//输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
public class Code10 {
    public static void main(String[] args) {
        System.out.println(NumberOf1(3));
    }

    public static int NumberOf1(int n) {
        int sum=0;
        String s = Integer.toBinaryString(n);
        for (char c:s.toCharArray()){
            if (c=='1'){
                sum++;
            }
        }
        return sum;
    }
}
