package main;
//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
//
//        示例 1:
//
//        输入: 121
//        输出: true
//        示例 2:
//
//        输入: -121
//        输出: false
//        解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
//        示例 3:
//
//        输入: 10
//        输出: false
//        解释: 从右向左读, 为 01 。因此它不是一个回文数。
public class Code102IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
    }
    public static boolean isPalindrome_(int x) {

        if(x < 0)
            return false;

        char[] ch = Integer.toString(x).toCharArray();
        int tmp = ch.length - 1;
        for(int i = 0; i <= ch.length / 2; i++){
            if(ch[i] != ch[tmp])
                return false;
            else
                tmp--;
        }
        return true;
    }
    public static boolean isPalindrome(int x) {
        int temp1=0,temp2 = x;
        while(x>0){
            temp1 = x%10 + temp1*10;
            x = x/10;
        }
        if (temp1 == temp2){
            return true;
        }
        else{
            return false;
        }
    }
}
