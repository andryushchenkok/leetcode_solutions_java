package easy;

import java.util.ArrayList;
import java.util.List;

// 412. Fizz Buzz
public class FizzBuzz {

    public List<String> fizzBuzz(int n) {

        List<String> answerList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            boolean isFizz = i % 3 == 0;
            boolean isBuzz = i % 5 == 0;

            if (isFizz && isBuzz) answerList.add("FizzBuzz");
            else if (isFizz) answerList.add("Fizz");
            else if (isBuzz) answerList.add("Buzz");
            else answerList.add(i + "");
        }
        return answerList;
    }

    public static void main(String[] args) {
        System.out.println(new FizzBuzz().fizzBuzz(15));
    }
}
