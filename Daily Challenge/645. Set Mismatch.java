class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] temp = new int[nums.length+1];
        int[] ans = new int[2];
        for(int n: nums){
            temp[n]++;
        }

        for(int i=1; i<temp.length; i++){
            if(temp[i] == 2)
                ans[0] = i;
            
            if(temp[i] == 0)
                ans[1] = i;
        }

        return ans;
    }
}
