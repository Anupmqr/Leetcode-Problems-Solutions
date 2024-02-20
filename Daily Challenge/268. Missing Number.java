class Solution {
    public int missingNumber(int[] nums) {
        int l = nums.length;
        int sum=0;
        for(int x : nums){
            sum+=x;
        }
        int y = (int)((l*(l+1))*0.5);
        return y-sum;
    }
}
