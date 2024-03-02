class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
        int ans[] = new int[nums.length];
        int s=0;
        int l= nums.length-1;
        int c = nums.length-1;
        while(s<=l){
            if(nums[s] > nums[l])
                ans[c--] = nums[s++];
            else
                ans[c--] = nums[l--];
        }
        return ans;
    }
}
