class Solution {
//vishal
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for(int pile : piles){
            high = Math.max(high, pile);
        }

        while(low < high){
            int mid = low + (high - low) / 2;
            if(canEatAll(piles, h, mid)){ 
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean canEatAll(int[] piles, int h, int k){
        int hoursNeeded = 0;
        for(int pile : piles){
            hoursNeeded += (pile + k - 1) / k;
        }
        return hoursNeeded <= h;
    }
}