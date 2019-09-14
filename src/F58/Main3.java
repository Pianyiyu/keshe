package F58;

    import com.sun.xml.internal.bind.v2.model.core.ID;

    import java.util.Scanner;
//10
//        2
//        4
//        2
//        6
//        1
//        7
//        8
//        9
//        2
//        1
    public class Main3 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int r = in.nextInt();
            int[] arr = new int[r];
            if (r < 2){
                System.out.println(1);
                return;
            }
            if (r == 2) {
                System.out.println(3);
                return;
            }
            for (int i = 0; i < r; i++) {
                arr[i] = in.nextInt();
            }
            int[] res = new int[r];
            if (arr[0] > arr[1]){
                res[0] = 2;
                res[1] = 1;
            }else{
                res[1] = 2;
                res[0] = 1;
            }
            for (int i = 2; i < r - 1; i++) {
                if (arr[i] > arr[i-1]){
                    res[i] = res[i-1] + 1;
                }else if (arr[i] == arr[i-1]){
                    res[i] = res[i-1] ;
                }else if (arr[i] > arr[i+1]) {
                    res[i] = 2;
                }else {
                    res[i] = 1;
                }

            }
            if (arr[r-1]<arr[r-2]){
                res[r-1] = 1;
            }else{
                res[r-1] = res[r-2]++;
            }
            int sum = 0 ;
            for (int i = 0; i < r; i++) {
                sum += res[i];
            }
            System.out.println(sum);
        }
    }
