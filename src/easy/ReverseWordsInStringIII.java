package easy;

// 557. Reverse Words in a String III
public class ReverseWordsInStringIII {

    public String reverseWords(String s) {
        StringBuilder answer = new StringBuilder();

        for (String originalWord : s.split(" ")) {
            StringBuilder reversedWord = new StringBuilder(originalWord).reverse();
            answer.append(reversedWord).append(" ");
        }

        return answer.toString().trim();
    }
}
