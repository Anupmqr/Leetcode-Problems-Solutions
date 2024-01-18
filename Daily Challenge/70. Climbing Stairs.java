class Solution {
    int a=0;
    int b=1;
    int ans =0;
    public int climbStairs(int n) {
        for(int i=1; i<=n; i++){
            ans = a+b;
            a = b;
            b = ans;
        }

        return ans;
    }
}
