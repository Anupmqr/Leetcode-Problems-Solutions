class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int zeros=0, ones=0;
        for(int x: students){
            if(x==1) ones++;
            else zeros++;
        }

        for(int y : sandwiches){
            if(y==0 && zeros==0) return ones;
            if (y==1 && ones==0) return zeros;

            if(y==0) zeros--;
            else ones--;
        }
        return 0;
    }
}
