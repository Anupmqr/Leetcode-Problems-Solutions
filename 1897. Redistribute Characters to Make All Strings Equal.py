class Solution(object):
    def makeEqual(self, words):
        """
        :type words: List[str]
        :rtype: bool
        """
        string = ''.join(words)
        s = set(string)
        for i in s:
            if string.count(i)%len(words)!=0:
                return False
        return True
