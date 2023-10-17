package easy;

// 709. To Lower Case
public class ToLowerCase {

    public String toLowerCase(String s) {

        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            int c_ascii = (int) c;
            if (c_ascii >= 65 && c_ascii <= 90) {
                sb.append((char) (c_ascii + 32));
            } else {
                sb.append((char) c_ascii);
            }
        }
        return sb.toString();
    }
}
