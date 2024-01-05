class Solution {
public:
    int lengthOfLIS(vector<int>& nums) {
        vector<int> v;

        v.push_back(nums[0]);
        int ans=1;
        for(int i=1; i<nums.size(); i++){
            if(v.back() < nums[i]){
            v.push_back(nums[i]);
            ans++;
            }
            else{
                int indx = lower_bound(v.begin(),v.end(),nums[i]) - v.begin();
                v[indx] = nums[i];
            }
        }

        return ans;

    }
};
