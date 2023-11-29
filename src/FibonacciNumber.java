public class FibonacciNumber {
    public static int fib(int n) {
        int f = 1;
        int s = 1;
        int result = 0;
        for (int i = 1; i < n - 1; i++) {
            result = s + f;
            f = s;
            s = result;
        }
        if (n == 0) {
            return 0;
        }
        return n <= 2 ? 1 : result;
    }
}
