package easy;

// 136. Single Number
public class SingleNumber {

    public int singleNumber(int[] nums) {

        int result = 0;

        // побитовое XOR для каждого элемента массива
        for (int num : nums) {
            result ^= num;
        }

        return result;
    }
}
