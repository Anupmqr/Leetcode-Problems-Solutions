class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();

        for(char x : chars1){
            freq1[x-'a']++;
        }

        for(char y : chars2){
            freq2[y-'a']++;
        }

        for (int i = 0; i < 26; ++i) {
            if ((freq1[i] > 0 && freq2[i] == 0) || (freq2[i] > 0 && freq1[i] == 0)) {
                return false; 
            }
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        for(int i=0; i<26; i++){
            if(freq1[i] != freq2[i])
            return false;
        }
        return true;
    }
}
