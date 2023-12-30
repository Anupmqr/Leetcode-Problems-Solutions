// Runtime
// 3ms
// Beats 94.16% of users with C++

class Solution {
public:
    vector<int> numberGame(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        reverse(nums.begin(),nums.end());
        stack<int> s;
        vector<int> ans;
        for(int i=0; i<nums.size(); i++){
            s.push(nums[i]);
        }
        while(!s.empty()){
        int a = s.top();
        s.pop();
        int b = s.top();
        s.pop();

        ans.push_back(b);
        ans.push_back(a);
        }
        
        return ans;
        
    }
};

//alternative
// sort and swap
