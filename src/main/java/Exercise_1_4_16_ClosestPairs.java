import java.util.Arrays;

import static java.util.Arrays.sort;

/**
 * 1.4.16 Closest pair (in one dimension).
 * Write a program that, given an array a[] of N double values, finds a closest pair :
 * two values whose difference is no greater than the difference of any other pair
 * (in absolute value). The running time of your program should be linearithmic in the worst case.
 */
public final class Exercise_1_4_16_ClosestPairs {

    public static void main(String[] args) {

    }

    static double[] closestPairs(final double[] numbers) {
        final StopWatch stopWatch = new StopWatch();
        sort(numbers);
        double minDiff = Double.MAX_VALUE;
        double value1 = numbers[0];
        double value2 = numbers[1];
        for (int i = 0; i < numbers.length - 1; i++) {
            double currentDiff = Math.abs(numbers[i] - numbers[i + 1]);
            if (currentDiff < minDiff) {
                value1 = numbers[i];
                value2 = numbers[i + 1];
                minDiff = currentDiff;
            }
        }
        stopWatch.stop();
        final double[] result = new double[]{value1, value2};
        final StringBuilder message = new StringBuilder("size: ").
                append(numbers.length).append(", result: ").append(Arrays.toString(result)).append(", ").
                append(stopWatch);
        System.out.println(message);
        return result;
    }
}
