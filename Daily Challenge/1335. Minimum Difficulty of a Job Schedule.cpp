class Solution {
public:
    int t[301][11];
    int solve(vector<int>& jd, int l, int indx, int d){
        //base case
        if(d==1){
            int maxD = INT_MIN;
            for(int i=indx; i<l; i++){
                maxD = max(maxD, jd[i]);
            }
            return maxD;
        }

        if(t[indx][d]!=-1)
        return t[indx][d];


        int maxD = INT_MIN;
        int final_result = INT_MAX;

        for(int i=indx; i<=l-d; i++){
            maxD = max(maxD, jd[i]);

            int result = maxD + solve(jd, l, i+1, d-1);
            final_result = min(final_result,result);
        }
        return t[indx][d] = final_result;
    }
    int minDifficulty(vector<int>& jd, int d) {
        int l = jd.size();

        if (l < d)
            return -1;

        memset(t,-1,sizeof(t));
        return solve(jd, l, 0, d);
    }    
};
