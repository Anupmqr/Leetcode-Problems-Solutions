class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score = 0;
        Arrays.sort(tokens);
        int l=0, r=tokens.length-1;
        int ans=0;

        while(l<=r){
            if(tokens[l]<=power){
                power -= tokens[l];
                score++;
                ans = score;
                l++;
            }
            else if(score>0){
                score--;
                power += tokens[r];
                r--;
            }
            else break;
        }
        return ans;
    }
}
