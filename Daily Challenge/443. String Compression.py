class Solution(object):
    def compress(self, chars):
        """
        :type chars: List[str]
        :rtype: int
        """
        l = len(chars)
        if l<2:
            return l

        i=j=0
        while i < l:
            c=1
            while i<l-1 and chars[i]==chars[i+1]:
                c+=1
                i+=1
            chars[j] = chars[i];
            j+=1;
            if c>1:
                for v in str(c):
                    chars[j]=v
                    j+=1
            i+=1
        return j
        
