import java.util.*;

class Solution {
    public int evalRPN(String[] tokens) {
        int a,b;
        Stack<Integer> s = new Stack<Integer>();

        for(String str : tokens){
            if(str.equals("+"))
                s.push(s.pop() + s.pop());
            else if(str.equals("-")){
                b = s.pop();
                a = s.pop();
                s.push(a - b);
            }
            else if(str.equals("*"))
                s.push(s.pop() * s.pop());
            else if(str.equals("/")){
                b = s.pop();
                a = s.pop();
                s.push(a / b);
            }
            else
                s.push(Integer.parseInt(str));
        }

        return s.pop();
    }
}
