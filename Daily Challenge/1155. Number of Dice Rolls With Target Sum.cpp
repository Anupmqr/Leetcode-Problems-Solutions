class Solution {
public:
    int numRollsToTarget(int n, int k, int target) {
        if (n * k < target) {
            return 0;
        }

        int dp[n][1001];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= 1000; j++) {
                dp[i][j] = 0;
            }
        }

        for (int i = 1; i <= min(k, target); i++) {
            dp[0][i] = 1;
        }

        int MOD = 1000000007;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= target; j++) {
                int ans = 0;
                for (int l = j - 1; l >= j - k && l >= 0; l--) {
                    ans = (ans + dp[i - 1][l]) % MOD;
                }
                dp[i][j] = ans;
            }
        }
        return dp[n - 1][target];
    }
};
