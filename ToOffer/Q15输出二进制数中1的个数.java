package ToOffer;

public class Q15 {
	  public int hammingWeight(int n) {
	        int i = 0;
	        while (n != 0){
	            // if (n % 2 !=0) i++;和逐位与运算相比low一点
	            i += n & 1;//尾位有1加0，无1加0
	            n = n >>> 1;//无视首位符号位
	        }
	        return i;
	    }
}
