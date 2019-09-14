package WeBank;

import java.util.Scanner;

//人族和兽族为了争夺一处矿产掀起了世界大战。大战在即，先知召集兽族各勇士学习新的攻击技能。
//
//        先知想要让n(1<=n<=100000)个兽族勇士都分别学会k(1<=k<=100000)种技能，
//        但一个一个教的效率太低，先知在精灵杂货铺那里买来了分身宝石，使用分身宝石后，
//        就出现了m(1<=m<=100000)个先知。先知教会一个兽族勇士一个技能的时间是1分钟，
//        一个兽族勇士在同一时间只能学习一个技能，一个先知在同一时间也只能教一个勇士学习技能，
//        不同先知或不同勇士当然可以在同一时间教授或学习技能。
//
//        大战即将爆发，先知想要知道最少需要多久才能教会n个勇士分别学会k个技能？
//64%
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int m = in.nextInt();
        System.out.println(p(n, k, m));
    }

    public static int p(int n, int k, int m) {
        if (n < 0) return 0;
        if (m >= n) return k;
        else return p(n - m, k, m) + k;
    }

}
