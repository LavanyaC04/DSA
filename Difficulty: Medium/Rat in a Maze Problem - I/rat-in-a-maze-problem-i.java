import java.util.*;

class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> ans = new ArrayList<>();
        int n = maze.length;
        int[][] vis = new int[n][n];
        if (maze[0][0] == 1)
            solve(0, 0, maze, n, ans, "", vis);
        return ans;
    }

    private void solve(int i, int j, int[][] maze, int n, ArrayList<String> ans, String path, int[][] vis) {
        if (i == n - 1 && j == n - 1) {
            ans.add(path);
            return;
        }
        vis[i][j] = 1;
        if (i + 1 < n && maze[i + 1][j] == 1 && vis[i + 1][j] == 0)
            solve(i + 1, j, maze, n, ans, path + "D", vis);
        if (j - 1 >= 0 && maze[i][j - 1] == 1 && vis[i][j - 1] == 0)
            solve(i, j - 1, maze, n, ans, path + "L", vis);
        if (j + 1 < n && maze[i][j + 1] == 1 && vis[i][j + 1] == 0)
            solve(i, j + 1, maze, n, ans, path + "R", vis);
        if (i - 1 >= 0 && maze[i - 1][j] == 1 && vis[i - 1][j] == 0)
            solve(i - 1, j, maze, n, ans, path + "U", vis);
        vis[i][j] = 0;
    }
}
