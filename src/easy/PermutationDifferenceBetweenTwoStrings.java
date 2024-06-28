package easy;

// 3146. Permutation Difference between Two Strings
public class PermutationDifferenceBetweenTwoStrings {

    public int findPermutationDifference(String s, String t) {

        int diff = 0;

        for (int i = 0; i < s.length(); i++) {
            diff += Math.abs(i - t.indexOf(s.charAt(i)));
        }

        return diff;
    }

    public static void main(String[] args) {

        System.out.println(new PermutationDifferenceBetweenTwoStrings().findPermutationDifference("abcde", "edbac"));
    }
}