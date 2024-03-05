class Solution {
    public int minimumLength(String s) {
        int l = 0;
        int h = s.length()-1;
        char x='\0';
        while(l<h){
            if(s.charAt(l)==s.charAt(h)){
                x = s.charAt(l);
                l++;
                h--;
            }
            else if(s.charAt(l)==x) l++;
            else if(s.charAt(h)==x) h--;
            else
                break;  
        }
            if (l >= h && (s.charAt(l)==x || s.charAt(h)==x)) return 0;
            else if (l==h) return 1;
            else return h-l+1;
    }
}
