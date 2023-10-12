package easy;

// 58. Length of Last Word
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        s = s.stripTrailing();
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                result += 1;
            } else {
                break;
            }
        }
        return result;
    }
}
