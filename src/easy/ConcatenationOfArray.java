package easy;

// 1929. Concatenation of Array
public class ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {
        int[] answer = new int[nums.length * 2];
        int insertPos = nums.length;

        for (int i = 0; i < nums.length; i++, insertPos++) {
            answer[i] = nums[i];
            answer[insertPos] = nums[i];
        }

        return answer;
    }
}
