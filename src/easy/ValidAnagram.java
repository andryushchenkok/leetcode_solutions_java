package easy;

import java.util.HashMap;
import java.util.Map;

// 242. Valid Anagram
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> word1 = new HashMap<>();
        Map<Character, Integer> word2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            calcLetter(word1, s.charAt(i));
            calcLetter(word2, t.charAt(i));
        }
        return word1.equals(word2);
    }

    private static void calcLetter(Map<Character, Integer> map, char c) {
        if (map.containsKey(c)) {
            map.put(c, map.get(c) + 1);
        } else {
            map.put(c, 1);
        }
    }
}
