class Solution {
    public int findJudge(int n, int[][] trust) {
        int arr[] = new int[n+1];
        int l = trust.length;

        for(int i=0; i<l; i++){
            arr[trust[i][1]]++;
        }

        int ans=-1;
        for(int i=1; i<=n; i++){
            if(arr[i] == n-1){
                ans = i;
                break;
            }
        }

        for(int i=0; i<l; i++){
            if(trust[i][0] == ans)
                return -1;
        }
        return ans;
    }
}
