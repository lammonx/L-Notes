package leetcode.easy;

public class Q121 {
	  public int maxProfit(int[] prices) {
		  //暴力解法
//	        int a = 0;
//	        for ( int i = prices.length - 1 ; i >= 0 ; i-- ){
//	            for (int j = 0 ; j < i ; j++){
//	                if((prices[i]-prices[j]) > a){
//	                    a = prices[i]-prices[j];
//	                }
//	            }
//	        }
//	        return a;
		  //擂台解法
		  int maxGet = 0 ;//第一次是自己减去自己
	        if(prices.length != 0){
	            int min = prices[0];
	            for (int i = 0; i < prices.length ; i ++ ){
	                min = Math.min(min , prices[i]);
	                maxGet = Math.max(maxGet , prices[i] - min);
	            }
	        }
	        return maxGet;
	    }
}
