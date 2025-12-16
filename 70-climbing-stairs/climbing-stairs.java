class Solution {
   
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1); 
        return climbStairsRecursive(n, dp);
    }

    private int climbStairsRecursive(int n, int[] dp) {
        if (n <= 2) {
            return n;
        }
        
        if (dp[n] != -1) {
            return dp[n]; 
        }

        
        dp[n] = climbStairsRecursive(n - 1, dp) + climbStairsRecursive(n - 2, dp);
        return dp[n];
    }
}
