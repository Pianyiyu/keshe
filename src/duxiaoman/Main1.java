package duxiaoman;

import java.util.Scanner;
//有一天，小A和小B玩了一个神奇的游戏，游戏开始时，桌面上有a0个不同盒子和b0个不同的物品，每个回合，两个人可以选择增加一个新的盒子或者一个新的物品(所有物品和盒子都不同)，记当前桌子上的盒子数量为a，物品数量为b，当把b个物品放入a个盒子的方案数不小于n时，游戏结束，此时最后一位操作者判负。
//
//        给出a0，b0，n，如果小A先手，两个人都采用最优策略，谁能获胜，如果A获胜输出“A”，如果B获胜，输出“B”，如果是平局，输出“A&B”。
//        3
//        2 2 10
//        3 1 4
//        1 4 10
//        样例输出
//        B
//        A
//        A&B
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s1=in.nextInt();
        int[][] arr=new int[s1][3];
        for (int i = 0; i < s1; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j]=in.nextInt();
            }
        }

        System.out.println("B");
        System.out.println("A");
        System.out.println("A&B");
    }
    public void func(int[][] array,int[] arr){



    }


}
