import static java.lang.System.out;
import static java.util.Arrays.sort;

/**
 * 1.4.16 Closest pair (in one dimension).
 * Write a program that, given an array a[] of N double values, finds a closest pair :
 * two values whose difference is no greater than the difference of any other pair
 * (in absolute value). The running time of your program should be linearithmic in the worst case.
 */
public final class Exercise_1_4_16_ClosestPairs {

    public static void main(String[] args) {
        // Double ratio experiment
        double[] input = worstInput(2);
        final StopWatch stopWatch = new StopWatch();
        closestPairs(input);
        long prev = stopWatch.stop();
        for (int n = 2; true; n += n) {
            input = worstInput(n);
            stopWatch.restart();
            closestPairs(input);
            long time = stopWatch.stop();
            out.println("array size: " + n + ", time: " + stopWatch + ", time ratio: " + (time * 1.0) / prev);
            prev = time;
        }
    }

    static double[] worstInput(final int size) {
        final double[] input = new double[size];
        for (int i = 0; i < size; i++) {
            input[i] = (double) i + 1;
        }
        input[size - 2] = input[size - 1] - 0.1;
        return input;
    }

    static double[] closestPairs(final double[] numbers) {
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
        return new double[]{value1, value2};
    }
}
