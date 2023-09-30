package easy;

// 9. Palindrome Number
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int orig = x, x_new = 0;
        while (x > 0) {
            x_new = x_new * 10 + x % 10;
            x /= 10;
        }
        return x_new == orig;
    }
}
