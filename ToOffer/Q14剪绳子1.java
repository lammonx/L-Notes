package ToOffer;

public class Q14 {
	public int cuttingRope(int n) {
        if (n <= 3) return n - 1;
        int a = n % 3;
        int b = n / 3;
        if (a == 2) return (int)Math.pow(3, b) * 2;
        return (int)Math.pow(3, b - 1) * (a + 3);//3越多，值越大
    }
}
