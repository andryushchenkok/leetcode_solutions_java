package easy;

import java.util.HashSet;
import java.util.Set;

// 217. Contains Duplicate
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
