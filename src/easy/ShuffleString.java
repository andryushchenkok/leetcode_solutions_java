package easy;

// 1528. Shuffle String
public class ShuffleString {

    public String restoreString(String s, int[] indices) {
        char[] answer = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            int index = indices[i];
            answer[index] = s.charAt(i);
        }
        return String.valueOf(answer);
    }
}
