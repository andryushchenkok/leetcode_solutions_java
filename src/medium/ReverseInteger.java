package medium;

// 7. Reverse Integer
public class ReverseInteger {
    public int reverse(int x) {
        long num = 0;

        while (x != 0) {
            num = num * 10 + x % 10;
            x /= 10;
        }

        if (num < Integer.MIN_VALUE || num > Integer.MAX_VALUE) return 0;

        return (int) num;
    }
}
