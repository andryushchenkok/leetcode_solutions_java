package easy;

// 1309. Decrypt String from Alphabet to Integer Mapping
public class DecryptStringFromAlphabetToIntegerMapping {
    public String freqAlphabets(String s) {

        final String alphabets = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder answer = new StringBuilder();
        int pos = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                pos = Integer.parseInt(s.substring(i - 2, i));
                answer.append(alphabets.charAt(pos - 1));
                i -= 2;
            } else {
                pos = Integer.parseInt(String.valueOf(s.charAt(i)));
                answer.append(alphabets.charAt(pos - 1));
            }
        }

        return answer.reverse().toString();
    }

    public static void main(String[] args) {
        // jkab
        System.out.println(new DecryptStringFromAlphabetToIntegerMapping().freqAlphabets("10#11#12"));
        // acz
        System.out.println(new DecryptStringFromAlphabetToIntegerMapping().freqAlphabets("1326#"));
    }
}
