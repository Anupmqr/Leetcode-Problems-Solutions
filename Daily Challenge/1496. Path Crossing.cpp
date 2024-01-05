//c++ code without using map and set

class Solution {
public:
    bool isPathCrossing(string path) {
        int x=0;
        int y=0;
        int a[10000],b[10000];
        for(int i=0; i<path.length(); i++){
            if(path[i]=='E') ++y;
            else if(path[i]=='W') --y;
            else if(path[i]=='N') ++x;
            else if(path[i]=='S') --x;

            a[i] = x;
            b[i] = y;
        }

        int n= path.length();

        for (int i = 0; i < n; i++) {
            if(a[i]==0 && b[i] == 0)
                return true;
            for (int j = i+1; j < n; j++){
                if(a[i]==a[j] && b[i]==b[j])
                    return true;
            }
        }
        return false;
    }
};
