package easy;

// 977. Squares of a Sorted Array
public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {

        int left = 0, right = nums.length - 1;
        int insertPointer = nums.length - 1;
        int[] answer = new int[nums.length];

        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                answer[insertPointer] = nums[left] * nums[left];
                left++;
            } else {
                answer[insertPointer] = nums[right] * nums[right];
                right--;
            }
            insertPointer--;
        }
        return answer;
    }
}
