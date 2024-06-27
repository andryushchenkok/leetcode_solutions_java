package easy;

// 434. Number of Segments in a String
public class NumberOfSegmentsInString {

    public int countSegments(String s) {

        boolean isStart = true;
        int ans = 0;

        for (char c : s.toCharArray()) {
            if (isStart && c != ' ') {
                ans += 1;
                isStart = false;
            }
            if (!isStart && c == ' ') {
                isStart = true;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        String s = ", , , ,        a, eaefa";
        System.out.println(new NumberOfSegmentsInString().countSegments(s));
    }
}
