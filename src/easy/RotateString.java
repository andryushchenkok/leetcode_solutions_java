package easy;

// 796. Rotate String
public class RotateString {

    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length())
            return false;
        return (s + s).contains(goal);
    }
}
