package easy;

// 704. Binary Search
public class BinarySearch {

    public int search(int[] nums, int target) {

        int leftPosition = 0;
        int rightPosition = nums.length - 1;

        while (leftPosition <= rightPosition) {
            int midPosition = (leftPosition + rightPosition) / 2;

            if (nums[midPosition] == target) {
                return midPosition;
            } else {
                if (nums[midPosition] < target) {
                    leftPosition = midPosition + 1;
                } else {
                    rightPosition = midPosition - 1;
                }
            }
        }
        return -1;
    }
}
