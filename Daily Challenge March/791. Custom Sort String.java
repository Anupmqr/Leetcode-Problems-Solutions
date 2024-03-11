class Solution {
    public String customSortString(String order, String s) {
        int[] arr = new int[26];
        for(char ch: s.toCharArray()){
            arr[ch-'a']++;
        }

        StringBuilder ans = new StringBuilder();

        for(char ch : order.toCharArray()){
            while(arr[ch-'a']!=0){
                ans.append(ch);
                arr[ch-'a']--;
            }
        }

        for(char ch: s.toCharArray()){
            if(arr[ch-'a']!=0)
                ans.append(ch);
        }
        return ans.toString();
    }
}
