package KuaiShou;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
//            int index = in.nextInt();
//            if (index != 0) {
//                String s= jie(index);
//                for (int i = s.length()-1; i >=0; i--) {
//                    if (s.charAt(i)!='0'){
//                        System.out.println(s.charAt(i));
//                        break;
//                    }
//                }
//            }else System.out.println(-1);
//        }
        int i = in.nextInt();
        StringBuffer stringBuffer = new StringBuffer("1");
        stringBuffer.insert(0, '2');
        System.out.println(jie(i));

    }

    public static String jie(int num) {

        StringBuffer stringBuffer = new StringBuffer("1");
        while (num != 0) {
            int index = 0;
            int preindex=0;
            for (int i = stringBuffer.length() ; i > 0; i--) {
                Integer integer=Integer.parseInt(String.valueOf(stringBuffer.charAt(i-1)));
                int a=index+integer+preindex;
                preindex=a/10;
                stringBuffer.replace(i-1,i,""+a%10);
                int c= integer*num+index;
                index=c/10;
                int cur=c%10;
                stringBuffer.replace(i-1,i,""+cur);
            }
            if (index != 0)
                stringBuffer.insert(0, index);

            num--;
        }

        return stringBuffer.toString();
    }
}