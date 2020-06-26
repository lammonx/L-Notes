package ToOffer;

public class Q11 {
	public int numWays(int n) {
        int fn = 1;
        int temp = 0;
        while(n > 0){
            int nextFn = fn + temp;
            temp = fn;
            fn = nextFn%1000000007;
            n--;
        }
        return fn;
    }
}
