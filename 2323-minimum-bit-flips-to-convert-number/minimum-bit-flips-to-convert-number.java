class Solution {
    public int minBitFlips(int start, int goal) {
       
        int ans=Integer.bitCount(start ^ goal);
        System.out.println(ans);
        return ans;
        
    }
}