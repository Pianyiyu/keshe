package main;
//给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
//
//        示例 1:
//
//        输入: "aba"
//        输出: True
//        示例 2:
//
//        输入: "abca"
//        输出: True
//        解释: 你可以删除c字符。
public class Code128ValidPalindrome {
    public boolean validPalindrome(String s) {
        int left=0;
        char []temp=s.toCharArray();
        int right=temp.length-1;
        while(left<right){
            if(temp[left]!=temp[right]){
                if(isPalin(temp,left+1,right)||isPalin(temp,left,right-1))
                    return true;
                else
                    return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean isPalin(char[] temp, int left,int right){
        if(left>right)
            return false;
        while(left<=right){
            if(temp[left]!=temp[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
