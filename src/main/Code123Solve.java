package main;
//给定一个二维的矩阵，包含 'X' 和 'O'（字母 O）。
//        找到所有被 'X' 围绕的区域，并将这些区域里所有的 'O' 用 'X' 填充。
//        示例:
//        X X X X
//        X O O X
//        X X O X
//        X O X X
//        运行你的函数后，矩阵变为：
//        X X X X
//        X X X X
//        X X X X
//        X O X X
//        解释:
//        被围绕的区间不会存在于边界上，换句话说，任何边界上的 'O' 都不会被填充为 'X'。 任何不在边界上，或不与边界上的 'O' 相连的 'O' 最终都会被填充为 'X'。如果两个元素在水平或垂直方向相邻，则称它们是“相连”的。

public class Code123Solve {
    int row,col;
    public void solve(char[][] board) {
        if(board==null||board.length==0)
            return ;
        row=board.length;
        col=board[0].length;
        for(int i=0;i<row;i++){    //对第一列和最后一列的所有O进行深度优先搜索
            dfs(board,i,0);
            dfs(board,i,col-1);
        }
        for(int j=0;j<col;j++){    //对第一行和最后一行的所有O进行深度优先搜索
            dfs(board,0,j);
            dfs(board,row-1,j);
        }
        for(int i=0;i<row;i++){    //遍历矩阵，将O变为X，将-变为O
            for(int j=0;j<col;j++){
                if(board[i][j]=='O')
                    board[i][j]='X';
                if(board[i][j]=='-')
                    board[i][j]='O';
            }
        }
        return ;
    }
    /**
     * 使用递归进行深度优先搜索
     */
    public void dfs(char[][] board,int i,int j){
        if(i<0||j<0||i>=row||j>=col||board[i][j]!='O')   //递归终止条件判断
            return;
        board[i][j]='-';    //将当前O更改为-
        dfs(board,i-1,j);   //递归该点上方的点
        dfs(board,i+1,j);   //递归该点下方的点
        dfs(board,i,j-1);   //递归该点左边的点
        dfs(board,i,j+1);   //递归该点右边的点
        return ;
    }
}
