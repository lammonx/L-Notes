package leetcode.mid;

public class Q49 {
    public int nthUglyNumber(int n) {
        int a = 0;
        int b = 0;
        int c = 0;
        //我的解法是形成n*4的一个表格来理解
        //执行时间为1ms的另外写了这个方法，可能是已经建好了1-1690的数组
        int aN;//*2的一行
        int bN;//*3的一行
        int cN;//*5的一行
        int[] uglyNums = new int[n];//一组丑数第一行
        uglyNums[0] = 1;
        for (int i = 1; i < n; i++) {
            aN = uglyNums[a] * 2;
            bN = uglyNums[b] * 3;
            cN = uglyNums[c] * 5;
            uglyNums[i] = Math.min(Math.min(aN, bN), cN);
            if (uglyNums[i] == aN) a++;
            if (uglyNums[i] == bN) b++;
            if (uglyNums[i] == cN) c++;
        }
        return uglyNums[n - 1];
    }
}
