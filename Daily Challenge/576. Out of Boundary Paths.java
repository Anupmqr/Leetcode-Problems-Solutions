class Solution {
    Integer[][][] dp;
    int mod = 1_000_000_000+7;
    int m, n;
    
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        dp = new Integer[m][n][maxMove+1];
        this.m=m;
        this.n=n;
        return findMoves(maxMove, startRow, startColumn);
    }

    int findMoves(int maxMove, int r, int c){
        if(r<0 || r>=m || c<0 || c>=n)
            return 1;

        if(maxMove<=0)
            return 0;

        if(dp[r][c][maxMove]!=null)
            return dp[r][c][maxMove];

        int res=0;
        res=(res+findMoves(maxMove-1, r+1, c))%mod;
        res=(res+findMoves(maxMove-1, r, c-1))%mod;
        res=(res+findMoves(maxMove-1, r-1, c))%mod;
        res=(res+findMoves(maxMove-1, r, c+1))%mod;
        dp[r][c][maxMove]=res;

        return res;
    }
}
