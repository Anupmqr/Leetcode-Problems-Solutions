import java.util.Stack;

class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> stk = new Stack<>();
        StringBuilder result = new StringBuilder();

        int open = 0;

        for (char c : s.toCharArray()) {
            if(c!='(' && c!=')')
                stk.push(c);
            else if(c=='('){
                open++;
                stk.push(c);
            }
            else if(open > 0){
                stk.push(c);
                open--;
            }
        }

        int close = 0;

        while (!stk.isEmpty()) {
            char c = stk.pop();
            if(c!='(' && c!=')')
                result.append(c);
            else if(c==')'){
                close++;
                result.append(c);
            }
            else if(close > 0){
                result.append(c);
                close--;
            }
        }

        return result.reverse().toString();
    }
}
