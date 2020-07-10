package leetcode.mid;

import java.util.ArrayList;
import java.util.List;

public class Q78 {
	public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int length = 1 << nums.length;
        for (int i = 0;i < length;i++) {
            List<Integer> sub = new ArrayList<>();
            for (int j = 0;j < nums.length;j++){
                if (((i >> j) & 1) == 1) sub.add(nums[j]);
            }
            result.add(sub);
        }
        return result;
    }
}
