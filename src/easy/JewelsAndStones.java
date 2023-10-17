package easy;

import java.util.HashMap;
import java.util.Map;

// 771. Jewels and Stones
public class JewelsAndStones {

    public int numJewelsInStones(String jewels, String stones) {

        Map<Character, Integer> chars = new HashMap<>();

        int sum = 0;

        for (int i = 0; i < stones.length(); i++) {
            char c = stones.charAt(i);

            if (chars.containsKey(c)) {
                chars.put(c, chars.get(c) + 1);
            } else {
                chars.put(c, 1);
            }
        }

        for (char c : jewels.toCharArray()) {
            if (chars.containsKey(c)) {
                sum += chars.get(c);
            }
        }

        return sum;
    }
}
