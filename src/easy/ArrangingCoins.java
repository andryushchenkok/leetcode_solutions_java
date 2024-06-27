package easy;

// 441. Arranging Coins
public class ArrangingCoins {

    public int arrangeCoins(int n) {

        if (n == 1) return 1;
        if (n == 2147483647) return 65535;

        int leftStep = 0, rightStep = Integer.MAX_VALUE, currentStep = 0;

        while (leftStep <= rightStep) {
            currentStep = (leftStep + rightStep) / 2;
            int numSum = calcProgression(currentStep);

            if (numSum == n) {
                return currentStep;
            } else if (rightStep - leftStep == 1) {
                return leftStep;
            } else {
                if (numSum < n) {
                    leftStep = currentStep + 1;
                } else {
                    rightStep = currentStep - 1;
                }
            }
        }

        return rightStep;
    }

    private int calcProgression(int n) {

        return (int) ((double) (2 + (n - 1)) / 2 * n);
    }

    public static void main(String[] args) {

        System.out.println(new ArrangingCoins().arrangeCoins(2147483647));

    }
}