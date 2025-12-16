class Solution {
    private int[] dp;

    public int fib(int n) {
        if (n <= 1) {
            return n;
        }

        dp = new int[n + 1];
        
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
        
        return fibWithMemo(n);
    }

    private int fibWithMemo(int n) {
        if (n <= 1) {
            return n;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = fibWithMemo(n - 1) + fibWithMemo(n - 2);
         
        return dp[n];
    }
}
