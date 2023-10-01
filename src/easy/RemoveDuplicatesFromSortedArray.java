package easy;

// 26. Remove Duplicates from Sorted Array
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int firstPointer = 0, secondPointer = 0;
        while (secondPointer < nums.length) {
            while (secondPointer < nums.length - 1 && nums[secondPointer] == nums[secondPointer + 1]) {
                secondPointer += 1;
            }
            nums[firstPointer] = nums[secondPointer];
            firstPointer += 1;
            secondPointer += 1;
        }
        return firstPointer;
    }
}
