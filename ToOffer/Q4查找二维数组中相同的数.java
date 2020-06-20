package ToOffer;

public class Q4 {

	public boolean findNumberIn2DArray(int[][] matrix, int target) {
	       if(matrix.length > 0 && matrix[0].length > 0) {
	        	int m = matrix.length - 1 ;
	        	int n = 0;
	        	while(m >= 0 && n < matrix[0].length) {
	        		if(matrix[m][n] == target) {
	        			return true;
	        		}else if (matrix[m][n] > target) {
	                        m--;
					}else {
						n++;
					}
	        	}
	        }
	        return false;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
