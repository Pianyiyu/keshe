package F58;

import java.util.HashSet;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solve(arr,0,0,arr[0][0]));

    }
    public static int solve(int[][] arr ,int i, int j,int res){
        if (arr.length-1 == i && arr[0].length -1 ==j){
            return res;
        }else if (arr.length - 1 == i){
            res+=arr[i][j+1];
            return solve(arr,i,j+1,res);
        }else if (arr[0].length-1 == j){
            res+=arr[i+1][j];
            return solve(arr,i+1,j,res);
        }
        return Math.min(solve(arr,i+1,j,res+arr[i+1][j]),solve(arr,i,j+1,res+arr[i][j+1]));
    }
}
