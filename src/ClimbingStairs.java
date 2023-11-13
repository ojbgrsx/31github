public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 1) {
            return n;
        }
        return fibonacciSeq(n);
    }

    public int fibonacciSeq(int n) {
        int first = 1;
        int second = 1;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }
        return sum;
    }
}
