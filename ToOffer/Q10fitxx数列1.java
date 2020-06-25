package ToOffer;

public class Q10 {
	public int fib(int n) {
		//递归虽简单，但是耗时太多
//		  if(n == 0 || n == 1){
//	           return n;
//	       } 
//	       int f = fib(n-1)+fib(n-2);
//	       return f%1000000007; 
		
		
		int a = 0;//只有a用来记录当前f(n),b只是存f(n-1)的(第一个b除外，后面比如a表示f1时 ，b=f0=0)
		int b = 1;
		int c ;
		while(n > 0) {//循环n次
			c = a + b;
			b = a;//代表上个a
			a = c%1000000007;//下个a
			n--;
		}
		return a;
	}

}
