package easy;

// 258. Add Digits
public class AddDigits {

    public int addDigits(int num) {

        int sum = num;

        while (sum > 9) {
            sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return sum;
    }
}
