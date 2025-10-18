

class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        int n = nums.length;
        int[][] intervals = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            intervals[i][0] = nums[i] - k;  // start
            intervals[i][1] = nums[i] + k;  // end
        }
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        long nextAvailable = Long.MIN_VALUE;
        int distinct = 0;
        
        for (int[] interval : intervals) {
            long start = interval[0];
            long end = interval[1];
            
            if (nextAvailable < start) {
                nextAvailable = start;
            }
            
            if (nextAvailable <= end) {
                distinct++;
                nextAvailable++;
            }
        }
        
        return distinct;
    }
}
