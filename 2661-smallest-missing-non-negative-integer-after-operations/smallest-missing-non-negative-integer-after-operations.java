class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int num:nums)
        {
            int mod=((num % value) +value)% value;
            m.put(mod, m.getOrDefault(mod,0) + 1);
        }
        int mex=0;
        while(true){
            int rem = mex % value;
            if(!m.containsKey(rem) || m.get(rem)==0){
                return mex;
            }
            m.put(rem,m.get(rem)-1);
            mex++;

        }
        
    }
}