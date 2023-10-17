package easy;

// 14. Longest Common Prefix
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        String shortestWord = strs[0];
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < shortestWord.length())
                shortestWord = strs[i];
        }

        StringBuilder commonPrefix = new StringBuilder();
        for (int i = 0; i < shortestWord.length(); i++) {
            char c = shortestWord.charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i) != c)
                    return commonPrefix.toString();
            }
            commonPrefix.append(c);
        }
        return commonPrefix.toString();
    }
}
