package ToOffer;

import java.util.Stack;

public class Q9 {
    Stack<Integer> s1;
    Stack<Integer> s2;
	public Q9() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void appendTail(int value) {
		s1.push(value);
    }
    
    public int deleteHead() {
//    	if( s1.empty() && s2.empty()) {
//    		return -1;
//    	}
//    	while (!s1.empty()) {
//    		s2.push(s1.pop());
//    	}
//    	int a = s2.pop();
//    	while (!s2.empty()) {
//    		s1.push(s2.pop());
//    	}
//    	return a;
    	
    	//优化后
    	if( s1.empty() && s2.empty()) {
    		return -1;
    	}else if(s2.empty()){
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
    public static void main(String[] args) {
		Q9 q9 = new Q9();
		System.out.println(q9.deleteHead());
	}
}
