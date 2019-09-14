package main;

public class Code81EditDistance {


    public static void main(String[] args) {

        System.out.println(editDistance("eabcd","bcde"));
    }

    /**
     * 计算两个字符串的编辑距离
     * @param str1 需要比较的字符串
     * @param str2 需要比较的字符串
     * @return 两个字符串的编辑距离
     */
    public static int editDistance(String str1,String str2) {

        int lenStr1 = str1.length();
        int lenStr2 = str2.length();
        int[][] edit = new int[lenStr1][lenStr2];
        for (int i = 0; i < lenStr1; i++) {
            edit[i][0] = i;
        }
        for (int j = 0; j < lenStr2; j++) {
            edit[0][j] = j;
        }

        for (int i = 1; i < lenStr1; i++) {
            for (int j = 1; j < lenStr2; j++) {
//                d[i - 1][j] + 1 删除
//                d[i][j - 1] + 1 插入
//                d[i - 1][j - 1] + cost 修改
                int cost = (str1.charAt(i) == str2.charAt(j) ? 0 : 1);
                int del = edit[i - 1][j] + 1;
                int insert = edit[i][j - 1] + 1;
                int sub = edit[i - 1][j - 1] + cost;
                edit[i][j] = GetMinNum(del, insert, sub);
            }
        }
        return edit[lenStr1 - 1][lenStr2 - 1];
    }
    static int GetMinNum(int a, int b, int c)//获取三个数中最小数
    {
        int min = a < b ? a : b;
        return min < c ? min : c;
    }
}
