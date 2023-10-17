package easy;

// 1859. Sorting the Sentence
public class SortingTheSentence {

    public String sortSentence(String s) {

        String[] strings = s.split(" ");
        String[] result = new String[strings.length];

        for (String str : strings) {
            int arrPos = Integer.parseInt(str.charAt(str.length() - 1) + "");
            result[arrPos - 1] = str.substring(0, str.length() - 1);
        }
        return String.join(" ", result);
    }
}
