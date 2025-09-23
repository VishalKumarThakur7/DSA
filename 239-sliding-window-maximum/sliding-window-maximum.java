class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) { if (nums == null || nums.length == 
    
                0)     return new int[0];

        Deque<Integer> dq = new ArrayDeque<>();  // store indexes
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            // 1. Remove indexes out of this window
            if (!dq.isEmpty() && dq.peekFirst() == i - k) {
                dq.pollFirst();
            }

            
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            // 3. Add current element index
            dq.offerLast(i);

            // 4. Record the max (front of deque) once the first window is done
            if (i >= k - 1) {
                result[idx++] = nums[dq.peekFirst()];
            }
        }

        return result;
    }
        
    }
