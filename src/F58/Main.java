package F58;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] s1 = s.split(",");
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i <s1.length; i++) {
            set.add(s1[i]);
        }
        System.out.println(set.size());
    }
}
