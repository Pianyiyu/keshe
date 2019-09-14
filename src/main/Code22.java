package main;



//给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。
//
//        示例1:
//
//        输入: 5
//        输出: True
//        解释: 1 * 1 + 2 * 2 = 5
//
//
//        示例2:
//
//        输入: 3
//        输出: False
public class Code22 {

    public static void main(String[] args) {
        System.out.println(judge(10));
    }

        //解法1
        public static boolean judgeSquareSum(int c) {
            for(int i = 0; i <= Math.sqrt(c); i++)
            { double x = Math.sqrt(c - i* i);
                if(x == (int)x) return true;
            }
            return false;
        }
        //解法二
        public static boolean judge(int num){
            int left=0;
            int right=(int) Math.sqrt(num);
            while (left<=right){
                long tf=left*left+right*right;
                if (tf==num){
                    System.out.println(""+left+"    "+right); return true;}
                if (tf<num) left++;else right--;
            }
            return false;
        }

}
