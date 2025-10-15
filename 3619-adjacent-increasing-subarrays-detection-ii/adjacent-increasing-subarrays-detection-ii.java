class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n=nums.size();
        int [] left=new int[n];
        int [] right=new int[n];
        Arrays.fill(left,1);
        Arrays.fill(right,1);

        for(int i=1;i<n;i++){
            if(nums.get(i)>nums.get(i-1)){
                left[i]=left[i-1]+1;
            }
        }
        for(int i=n-2;i>0;i--){
            if(nums.get(i)<nums.get(i+1)){
                right[i]=right[i+1]+1;
            }
        }

        int ans=0;
        for(int i=0;i<n-1;i++){
            ans=Math.max(ans,Math.min(left[i],right[i+1]));
        }

        return ans;



        
    }
}