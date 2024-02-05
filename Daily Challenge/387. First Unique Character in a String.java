// Approach 1
class Solution {
    public int firstUniqChar(String s) {
        for(int i=0; i<s.length(); i++){
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
                return s.indexOf(s.charAt(i));
        }
        return -1;
    }
}


// Approach 2
class Solution {
    public int firstUniqChar(String s) {
        int[] arr = new int[26];

        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == 1)
                return i;
        }
        return -1;
    }
}
