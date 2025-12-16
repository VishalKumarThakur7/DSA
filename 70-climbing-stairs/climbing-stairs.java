class Solution {
   
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1); 
        return climbStairsRecursive(n, memo);
    }

    private int climbStairsRecursive(int n, int[] memo) {
        if (n <= 2) {
            return n;
        }
        
        if (memo[n] != -1) {
            return memo[n]; 
        }

        
        memo[n] = climbStairsRecursive(n - 1, memo) + climbStairsRecursive(n - 2, memo);
        return memo[n];
    }
}
