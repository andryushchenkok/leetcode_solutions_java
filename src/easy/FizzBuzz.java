package easy;

import java.util.ArrayList;
import java.util.List;

// 412. Fizz Buzz
public class FizzBuzz {

    public List<String> fizzBuzz(int n) {

        List<String> answerList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String num = "";
            if (i % 3 == 0) num += "Fizz";
            if (i % 5 == 0) num += "Buzz";
            if (num == "") num = i + "";
            answerList.add(num);
        }
        return answerList;
    }
}
