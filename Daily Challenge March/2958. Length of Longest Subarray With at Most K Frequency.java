class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int x : nums){
            max = Math.max(max,x);
            min = Math.min(min,x);
        }
        int[] freq = new int[max-min+1];

        int s=0,ans=0;
        for(int i=0; i<nums.length; i++){
            freq[nums[i]-min]++;
            while(freq[nums[i]-min] > k){
                freq[nums[s]-min]--;
                s++;
            }
            ans = Math.max(ans,i-s+1);
        }
        return ans;
    }
}
