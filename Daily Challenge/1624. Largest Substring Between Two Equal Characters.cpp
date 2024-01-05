// #Runtime
// 0 ms
// Beats 100.00% of users with C++
// #Memory
// 6.59 MB
// Beats 97.01% of users with C++

class Solution {
public:
    int maxLengthBetweenEqualCharacters(string s) {
        int ans = -1;
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<s.length(); j++){
                if(s[i] == s[j])
                    ans = max(ans, j-i-1);
            }
        }
        return ans;
    }
};
