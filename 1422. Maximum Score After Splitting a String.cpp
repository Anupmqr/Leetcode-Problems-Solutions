class Solution {
public:
int m=0;
    int maxScore(string s) {
      for(int i=0; i<s.length(); i++){
          int c=0; int x=0;
          for(int j=0; j<=i; j++){
              if(s[j]=='0'){
                  c++;
              }
          }

          for(int k=i+1; k<s.length(); k++){
              if(s[k]=='1'){
                  c++;
                  x++;
              }
          }
            if(x==0)
            c = c-1;
        m = max(m,c);
      } 
      return m;
    }
};
