package easy;

// 3110. Score of a String
public class ScoreOfString {

    public int scoreOfString(String s) {

        int score = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            score += Math.abs((int) s.charAt(i) - (int) s.charAt(i + 1));
        }

        return score;
    }

    public static void main(String[] args) {
        System.out.println(new ScoreOfString().scoreOfString("zaz"));
    }
}
