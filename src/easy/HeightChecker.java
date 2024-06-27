package easy;

// 1051. Height Checker
public class HeightChecker {

    public int heightChecker(int[] heights) {

        int[] sorted = heights.clone();

        for (int i = 0; i < sorted.length; i++) {
            for (int j = 0; j < sorted.length - 1; j++) {
                if (sorted[j] > sorted[j + 1]) {
                    int k = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = k;
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sorted[i]) ans += 1;
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(new HeightChecker().heightChecker(nums));
    }
}
