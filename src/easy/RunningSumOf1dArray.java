package easy;

// 1480. Running Sum of 1d Array
public class RunningSumOf1dArray {

    public int[] runningSum(int[] nums) {

        int[] result = new int[nums.length];
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            result[i] = currentSum;
        }
        return result;
    }
}
