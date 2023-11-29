package easy;

// 1920. Build Array from Permutation
public class BuildArrayFromPermutation {

    public int[] buildArray(int[] nums) {
        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            answer[i] = nums[nums[i]];
        }

        return answer;
    }
}
