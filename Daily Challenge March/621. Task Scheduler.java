// ans = (max-1) * (n+1) + no_of_max;


class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] arr = new int[26];

        for(char x : tasks){
            arr[x-'A']++;
        }

        int m=0;
        for(int y : arr){
            m=Math.max(m,y);
        }

        int n_m=0;
        for(int y : arr){
            if(m==y)
                n_m++;
        }

        int ans = (m-1) * (n+1) + n_m;

        return Math.max(ans,tasks.length);
    }
}
