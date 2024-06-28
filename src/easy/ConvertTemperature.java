package easy;

import java.util.Arrays;

// 2469. Convert the Temperature
public class ConvertTemperature {

    public double[] convertTemperature(double celsius) {
        double[] result = new double[2];

        result[0] = celsius + 273.15;
        result[1] = celsius * 1.80 + 32.00;

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ConvertTemperature().convertTemperature(36.50)));
    }
}
