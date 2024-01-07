class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxa=0;
        int maxd=0;
        for(int[] d : dimensions){
            int diag = d[0]*d[0] + d[1]*d[1];
            int a = d[0] * d[1];
            if(diag > maxd || (diag==maxd && a > maxa)){
                maxa = a;
                maxd = diag;
            }
        }
        return maxa;
    }
}
