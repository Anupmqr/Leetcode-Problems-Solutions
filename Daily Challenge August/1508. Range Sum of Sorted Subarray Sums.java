class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int x = (n*(n+1))/2;
        int arr[] = new int[x];

        int h=0;
        for(int i=0; i<nums.length; i++){
            int s=0;
            for(int j=i; j<nums.length; j++){
                s+=nums[j];
                arr[h++]= s;
            }
        }
        
        int mod = (int) 1e9 + 7;

        Arrays.sort(arr);
        int ans=0;
        for(int i=left-1; i<right; i++){
            ans+=arr[i];
            ans= ans%mod;
        }

        return ans;
    }
}
