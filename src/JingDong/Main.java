package JingDong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        int count=Integer.parseInt(scanner.nextLine());
//        String s1=scanner.nextLine();
//        String s2=scanner.nextLine();
//        String s3=scanner.nextLine();
//        String T=scanner.nextLine();


        System.out.println(s("baa","a","aac","bbaac"));
//        System.out.println(s(s1,s2,s3,T));
    }

    public static int s(String s1,String s2,String s3,String T){
        if (T.length()<=0) return 0;
        int count=0;
        int i=1;
        List<Integer> list=new ArrayList<>();
        while (i<T.length()){
            for (int j = 0; j <=T.length() -i; ) {
                String temp=T.substring(j,j+i);
                System.out.println(temp);
                if (temp.equals(s1)||temp.equals(s2)||temp.equals(s3)) {
//                    System.out.println(temp);
                    if (!list.contains(j)){
                        list.add(j);
                        count++;
                    }
                    j=i+j;
                }else{
                    j++;
                }
            }
            i++;
        }
        return count;
    }
}
