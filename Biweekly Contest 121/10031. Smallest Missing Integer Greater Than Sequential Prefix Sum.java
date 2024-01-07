class Solution {
    public int missingInteger(int[] nums) {
        int sum= nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]+1)
                sum += nums[i];
            else
                break;
        }
        
        Set<Integer> set = new HashSet<>();
        for(int x: nums) set.add(x);
        
        for(int j=sum;j<100000;j++) {
            if (!set.contains(j)) return j;
        }
        return -1;
    }
}
