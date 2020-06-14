package leetcode.hot100;

public class Q27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int removeElement(int[] nums, int val) {
		int k=nums.length-1;
       for (int i=k; i >= 0; i--) {
    	   if(val==nums[i]) {
    		   nums[i]=nums[k];
    		   k--;
    	   }
       }
       return k+1;
    }
	
}
