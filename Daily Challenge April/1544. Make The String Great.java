class Solution {
    public String makeGood(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(!stk.isEmpty() && Math.abs(stk.peek() - s.charAt(i)) == 32) {
                stk.pop();
            } else {
                stk.push(s.charAt(i));
            }
        }
        StringBuilder result = new StringBuilder();
        for(Character c : stk) {
            result.append(c);
        }
        return result.toString();
    }
}
