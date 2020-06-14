package leetcode.hot100;

import java.util.LinkedList;
import java.util.List;

public class Q3 {

	public static void main(String[] args) {
		Q3 q3=new Q3();
		int i=q3.lengthOfLongestSubstring("au");
		System.out.println(i);

	}
	    public int lengthOfLongestSubstring(String s) {
	        List<Character> list=new LinkedList<>();
	        int length=0;
	        for(int i=0;i<s.length();i++) {
	        	if(!list.contains(s.charAt(i))) {
	        		list.add(s.charAt(i));
	        	}else {
	        		for (int j = list.indexOf(s.charAt(i));j>=0; j--) {
						list.remove(j);
					}
	        		list.add(s.charAt(i));
	        	}
	        	length=Math.max(length, list.size());
	        }
	    	return length;
	    }

//    public int lengthOfLongestSubstring(String s) {
//       LinkedList<Character> q=new LinkedList<>();
//       int length = 0;
//       for (char c : s.toCharArray()) {
//		while(q.contains(c)) {
//			q.poll();
//		}
//		q.add(c);
//		length=Math.max(length, q.size());
//       }
//       return length;
//    }
}