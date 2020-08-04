package leetcode.mid;

public class Q134 {
    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        Q134 q = new Q134();
        System.out.println(q.canCompleteCircuit(gas, cost));
    }

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int N = gas.length;//暴力，时间太长
        if (N == 1) return gas[0] >= cost[0] ? 0 : -1;
        for (int i = 0; i < N; i++) {
            int a = 0;
            int b = 0;
            for (int j = i; ; j = (j + 1 + N) % N) {
                a += gas[j];
                b += cost[j];
                if ((i - j + N) % N == 1 && a >= b) return i;
                if (a < b) break;
            }
        }
        return -1;
    }
}
