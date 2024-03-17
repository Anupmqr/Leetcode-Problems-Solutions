class Solution {
    public long countSubstrings(String s, char c) {
        long ans=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==c) ans++;
        }
        return ans*(ans+1)/2;
    }
}
