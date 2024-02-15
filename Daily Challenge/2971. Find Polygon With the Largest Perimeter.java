class Solution {
    public long largestPerimeter(int[] nums) {
        int l = nums.length;
        long sum=0;
        for(int x:nums){
            sum+=x;
        }
        Arrays.sort(nums);
        for(int i= l-1; i>=2; i--){
            if(nums[i]<sum-nums[i])
                return sum;
            else
                sum-=nums[i];
        }
        return -1;
    }
}
