package main;


//给定一个二维网格和一个单词，找出该单词是否存在于网格中。
//
//        单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
//
//        示例:
//
//        board =
//        [
//        ['A','B','C','E'],
//        ['S','F','C','S'],
//        ['A','D','E','E']
//        ]
//
//        给定 word = "ABCCED", 返回 true.
//        给定 word = "SEE", 返回 true.
//        给定 word = "ABCB", 返回 false.
public class Code125Exist {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++)
                if (board[i][j]==word.charAt(0))
                    if (dfs(board,visited,i,j,0,word))
                        return true;
        return false;
    }

    private boolean dfs(char[][] board, boolean[][] visited, int i, int j, int idx,String word) {
        if (idx==word.length()) return true;
        if (i<0||j<0||i==board.length||j==board[0].length||visited[i][j]) return false;
        if (board[i][j]==word.charAt(idx)){
            visited[i][j] = true;
            boolean res = dfs(board,visited,i+1,j,idx+1,word)||dfs(board,visited,i-1,j,idx+1,word)
                    ||dfs(board,visited,i,j+1,idx+1,word)||dfs(board,visited,i,j-1,idx+1,word);
            visited[i][j] = false;
            return res;
        }
        return false;
    }
}
