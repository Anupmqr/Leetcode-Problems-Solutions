class Solution {
    public boolean isSubstringPresent(String s) {
        for(int i=0; i<s.length()-1; i++){
            char a = s.charAt(i);
            char b = s.charAt(i+1);
            for(int j=0; j<s.length()-1; j++){
                if(s.charAt(j)==b && s.charAt(j+1)==a) return true;
            }
        }
        return false;
    }
}
