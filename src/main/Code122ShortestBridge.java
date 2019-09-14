package main;

import java.util.LinkedList;
import java.util.Queue;

//在给定的二维二进制数组 A 中，存在两座岛。（岛是由四面相连的 1 形成的一个最大组。）
//
//        现在，我们可以将 0 变为 1，以使两座岛连接起来，变成一座岛。
//
//        返回必须翻转的 0 的最小数目。（可以保证答案至少是 1。）
//
//
//
//        示例 1：
//
//        输入：[[0,1],[1,0]]
//        输出：1
//        示例 2：
//
//        输入：[[0,1,0],[0,0,0],[0,0,1]]
//        输出：2
//        示例 3：
//
//        输入：[[1,1,1,1,1],[1,0,0,0,1],[1,0,1,0,1],[1,0,0,0,1],[1,1,1,1,1]]
//        输出：1

public class Code122ShortestBridge {

    int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
    Queue<int[]> queue;
    int[][] matrix;
    boolean[][] visited;
    int n;
    public int shortestBridge(int[][] A) {
        n = A.length;
        visited = new boolean[n][n];
        matrix = A;
        queue = new LinkedList<>();
        boolean found = false;
        for (int i=0;i<n && !found;i++) {
            for (int j=0;j<n && !found;j++) {
                if (matrix[i][j] == 1) {
                    dfs(i,j);
                    found = true;
                }
            }
        }
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int i = cur[0]/n;
            int j = cur[0]%n;
            for (int[] dir:dirs) {
                int x = i + dir[0];
                int y = j + dir[1];
                if (x < 0 || y < 0 || x >= n || y >= n || visited[x][y]) continue;
                if (matrix[x][y] == 1) return cur[1];
                visited[x][y]=true;
                queue.add(new int[]{x*n+y,cur[1]+1});
            }
        }
        return -1;
    }
    public  void dfs(int i, int j) {
        if (visited[i][j] || matrix[i][j] == 0) return;
        visited[i][j] = true;
        for (int[] dir:dirs) {
            int x = i+dir[0];
            int y = j+dir[1];
            if (x<0 || y<0||x>=n|| y>=n) continue;
            if (!visited[x][y] && matrix[x][y] == 0) {
                visited[x][y] = true;
                queue.add(new int[]{n*x+y,1});
            }
            dfs(x,y);
        }
    }
}
