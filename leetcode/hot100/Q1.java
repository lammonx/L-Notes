package leetcode.hot100;

//01-两数之和

import java.util.HashMap;
import java.util.Map;

public class Q1 {
  	 public int[] twoSum(int[] nums, int target) {
		 Map<Integer, Integer> m=new HashMap<>();
	    for (int i = 0; i < nums.length; i=i+2) {
			if(m.containsKey(target-nums[i]))
				return new int[] {m.get(target-nums[i]),i};
			m.put(nums[i], i);
			}
       for (int i = 1; i < nums.length; i=i+2) {
			if(m.containsKey(target-nums[i]))
				return new int[] {m.get(target-nums[i]),i};
			m.put(nums[i], i);
			}
	   return null;
	}
}