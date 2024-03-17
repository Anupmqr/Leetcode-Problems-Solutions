class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int x:nums) 
            if(x<10) 
                sum += x;
            else
            sum+=encrypt(x);
        return sum;
    }
    
    public int encrypt(int n){
        int m=-1;
        int c=0;
        while(n!=0){
            int r = n%10;
            m = Math.max(m,r);
            n = n/10;
            c++;
        }
        
        int r=0;
        for(int i=1; i<=c; i++){
            r = r*10 + m;
        }
        return r;
    }
}
