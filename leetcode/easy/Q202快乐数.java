package leetcode.easy;

import java.util.HashSet;

public class Q202 {
		
	static int getNext(int nowNum) {
		int nextNum = 0;
		while (nowNum > 0) {
			int oneNum = nowNum % 10;
			nowNum /= 10;
			nextNum += oneNum * oneNum;
		}
		return nextNum;
	}
	
	public boolean isHappy(int n) {
	        HashSet<Integer> set = new HashSet<>();
	        int num = getNext(n);
	        while (!set.contains(1) && !set.contains(num) ) {
	        	set.add(num);
	        	num = getNext(num);
	        }
	        return num == 1;
	}
}
