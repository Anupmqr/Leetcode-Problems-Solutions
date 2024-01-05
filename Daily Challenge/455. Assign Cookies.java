// Runtime
// 8ms
// Beats 98.82% of users with Java
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int ans=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0, j=0;
        while(i<g.length && j<s.length){
            if(s[j] >= g[i]){
                ans++;
                i++;
                j++;
            }
            else
            j++;
        }
    return ans;
    }
}
