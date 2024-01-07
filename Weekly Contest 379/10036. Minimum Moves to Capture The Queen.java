class Solution {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        if(a==e){
            if(a==c && (b<d && d<f || b>d && d>f)){
            }else
                    return 1;
        }
        
        if(b==f){
            if(b==d && (a<c && c<e || a>c && c>e)){
            }else
                    return 1;
        }
        
        if(c+d == e+f){
            if(a+b==c+d && (c<a && a<e || c>a && a>e)){
            }else
                    return 1;
        }
        
        if(c-d == e-f){
            if(a-b == c-d && (c<a && a<e || c>a && a>e)){
            }else
                    return 1;
        }
        return 2;
    }
}
