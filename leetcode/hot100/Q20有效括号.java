package leetcode.hot100;

import java.util.LinkedList;
import java.util.Stack;

public class Q20 {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;
        LinkedList<Integer> t = new LinkedList<>();
        t.add(0 + ')' - '(');
        t.add(0 + ']' - '[');
        t.add(0 + '}' - '{');//可以直接if不需要这样存储判断有点费事
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == ')' || c == '}' || c == ']'){
                if(stack.isEmpty()) {
                    return false;
                }
                int a = 0 + c - stack.peek();
                if(t.contains(a)) {
                stack.pop();
                continue;
                }
                return false;
            }
            stack.push(c);
        }
        if(stack.isEmpty()) return true;
        return false;
    }
    public static void main(String[] args) {
		Q20 q20 = new Q20();
		q20.isValid("()}}}}");
	}
}
