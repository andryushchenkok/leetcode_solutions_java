package easy;

// 509. Fibonacci Number
public class FibonacciNumber {

    public int fib(int n) {

        int prev = 0, current = 1, next = 1;

        if (n == 0) return 0;
        if (n == 1) return 1;

        for (int i = 0; i < n; i++) {
            next = prev + current;
            prev = current;
            current = next;
        }
        return prev;
    }

    public int fibFactorial(int n) {

        if (n <= 1) return n;
        return fibFactorial(n - 1) + fibFactorial(n - 2);
    }
}
