class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack=new Stack<>();
        Map<Integer,Integer> nextGem=new HashMap<>();

        for (int i = nums2.length - 1; i >= 0; i--) {
            int num = nums2[i];

            
            while (!stack.isEmpty() && stack.peek() <= num) {
                stack.pop();
            }

            
            if (stack.isEmpty()) {
                nextGem.put(num, -1);
            } else {
                nextGem.put(num, stack.peek());
            }

          
            stack.push(num);
        }

        
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = nextGem.get(nums1[i]);
        }

        return res;

        
    }
}