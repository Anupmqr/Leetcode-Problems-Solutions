class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans = 1;
        int zero = 0;
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero++;
                continue;
            }
            ans *= nums[i];
        }

        if (zero == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0)
                    res[i] = ans;
                else
                    res[i] = 0;
            }
        }
        else if(zero == 0){
            for (int i = 0; i < nums.length; i++)
                res[i] = ans/nums[i];
        }

        return res;
    }
}
