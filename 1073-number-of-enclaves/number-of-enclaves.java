class Solution {
    public int numEnclaves(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        for (int i = 0; i < n; i++) {
            if (mat[i][0] == 1) 
                dfs(mat, i, 0);
            if (mat[i][m - 1] == 1)
                dfs(mat, i, m - 1);
        }

        for (int i = 0; i < m; i++) {
            if (mat[0][i] == 1) 
                dfs(mat, 0, i);
            if (mat[n - 1][i] == 1)
                dfs(mat, n - 1, i);
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res += mat[i][j];
            }
        }

        return res;
        
    }

    static void dfs(int[][] mat, int r, int c) {
        if (r < mat.length && r > -1 && c < mat[0].length && c > -1 && mat[r][c] == 1) {
            mat[r][c] = 0;
            dfs(mat, r + 1, c);
            dfs(mat, r - 1, c);
            dfs(mat, r, c + 1);
            dfs(mat, r, c - 1);
        }
        
    }
}