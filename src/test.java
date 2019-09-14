import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class test {
//    public static void main(String[] args) {
////        String s1="abc";
////        String s2="abc";
////        String s3=new String("abc");
////        System.out.println(s1.equals(s3));
//
//        Integer i = 10;
//        Integer j = 10;
//        System.out.println(i == j);//true
//        Integer a = 128;
//        Integer b = 128;
//        System.out.println(a == b);//false
//        int k = 10;
//        System.out.println(k == i);//ture
//        int kk = 128;
//        System.out.println(kk == a);//true
//        Integer m = new Integer(10);
//        Integer n = new Integer(10);
//        System.out.println(m == n);//false
//
//    }


//        public static void main(String[] args) throws Exception{
//            ClassLoader classLoader=ClassLoader.getSystemClassLoader();
//            Class clazz=classLoader.loadClass("A");
//            System.out.print("Test");
//            clazz.forName("A");
//        }
//    }
//
//    class A{
//        static {
//            System.out.print("A");
//        }


    public static void main(String[] args) {
//        System.out.print(fun1());
//        int x=0xF;
//        System.out.println(x);

        List<int[]> list=new ArrayList<>();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            int[] arr=new int[1024];
            list.add(arr);
        }

    }

    public static String fun1() {
        try {
            System.out.print("A");
            return fun2();
        } finally {
            System.out.print("B");
        }
    }

    public static String fun2() {
        System.out.print("C");
        return "D";
    }


}
