import java.util.Random;

import static java.lang.System.out;
import static java.util.Arrays.sort;

/**
 * Farthest pair (in one dimension). Write a program that, given an array a[] of N
 * double values, finds a farthest pair : two values whose difference is no smaller than the
 * the difference of any other pair (in absolute value). The running time of your program
 * should be linear in the worst case.
 */
public final class Exercise_1_4_17_FarthestPairs {

    public static void main(String[] args) {
        // Double ratio experiment
        double[] input = randomInput(2);
        final StopWatch stopWatch = new StopWatch();
        farthestPairs(input);
        long prev = stopWatch.stop();
        for (int n = 2; true; n += n) {
            input = randomInput(n);
            stopWatch.restart();
            farthestPairs(input);
            long time = stopWatch.stop();
            out.println("array size: " + n + ", time: " + stopWatch + ", time ratio: " + (time * 1.0) / prev);
            prev = time;
            input = null;
        }
    }

    static double[] randomInput(final int size) {
        final Random random = new Random(1234);
        final double[] input = new double[size];
        for (int i = 0; i < size; i++) {
            input[i] = random.nextDouble();
        }
        return input;
    }

    static double[] farthestPairs(final double[] numbers) {
        double min = numbers[0];
        double max = numbers[0];
        for (final double number : numbers) {
            min = Math.min(number, min);
            max = Math.max(number, max);
        }
        return new double[]{min, max};
    }
}
