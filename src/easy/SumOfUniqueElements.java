package easy;

import java.util.HashMap;
import java.util.Map;

// 1748. Sum of Unique Elements
public class SumOfUniqueElements {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        Map<Integer, Integer> numbers = new HashMap<>();

        for (int n : nums) {
            if (!numbers.containsKey(n)) numbers.put(n, 1);
            else numbers.put(n, numbers.get(n) + 1);
        }

        for (int n : numbers.keySet()) {
            if (numbers.get(n) == 1) sum += n;
        }

        return sum;
    }

    public static void main(String[] args) {
        SumOfUniqueElements c = new SumOfUniqueElements();

        // 4
        System.out.println(c.sumOfUnique(new int[]{1, 2, 3, 2}));
        // 0
        System.out.println(c.sumOfUnique(new int[]{1, 1, 1, 1}));
        // 15
        System.out.println(c.sumOfUnique(new int[]{1, 2, 3, 4, 5}));
    }
}
