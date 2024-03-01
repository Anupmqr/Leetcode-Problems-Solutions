class Solution {
    public String maximumOddBinaryNumber(String s) {
        int ones=0;
        int zeros=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1') ones++;
            if(s.charAt(i)=='0') zeros++;
        }

        String res="";

        for(int i=0; i<s.length()-1; i++){
            if(ones>1){
                res+= '1';
                ones--;
            }
            else
                res+='0';
        }
        return res+1;
    }
}
