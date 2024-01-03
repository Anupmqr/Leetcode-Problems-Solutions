class Solution {
public:
    int numberOfBeams(vector<string>& bank) {
        int c=0, n=0, t=0;
        for(int i=0; i< bank.size(); i++){
            n = count(bank[i].begin(), bank[i].end(), '1');
            if(n!=0){
            c += n * t;
            t = n;
            }
        }
        return c;
    }
};
