package ToOffer;


//import java.util.HashSet;

public class Q3 {

	public static void main(String[] args) {
		
	}
	public int findRepeatNumber(int[] nums) {
//		HashSet< Integer> set = new HashSet<>();
//		for (int i = 0; i < nums.length; i++) {
//			if(set.contains(nums[i])) {
//				return nums[i];
//			}
//			set.add(nums[i]);
//		}
//		return 0;
		int n ;
		for (int i = 0; i < nums.length; i++) {
			
			while(nums[i]!=i) {
				if(nums[i]==nums[nums[i]]) {
					return nums[i];
				}
				n = nums[i];
				nums[i] = nums[n];
				nums[n] = n;
			}	
		}
		return -1;
	}
}
//查找对比索引和对应值是否存在（即相等重复）