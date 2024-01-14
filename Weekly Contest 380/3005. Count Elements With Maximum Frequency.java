class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        int maxFreq = 0;
        for(int x : nums){
            ++freq[x];
            maxFreq = Math.max(maxFreq,freq[x]);
        }
        
        int ans = 0;
        for(int i=0; i<freq.length; i++){
            if(freq[i] == maxFreq)
                ans+= maxFreq;
        }
        
        return ans;
    }
}
