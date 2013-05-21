import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public final class TestExercise_1_4_16_ClosestPairs {

    @Test
    public void closestPairs_with_6_numbers() {
        final double[] input = new double[]{1.0, 2.0, 3.0, 4.9, 5.0, 6.0};
        final double[] output = Exercise_1_4_16_ClosestPairs.closestPairs(input);
        assertArrayEquals(new double[]{4.9, 5.0}, output, 0.1);
    }

    @Test
    public void closestPairs_with_1_000_numbers() {
        final double[] input = input(1_000);
        final double[] output = Exercise_1_4_16_ClosestPairs.closestPairs(input);
        assertArrayEquals(new double[]{999.9, 1_000.0}, output, 0.1);
    }

    @Test
    public void closestPairs_with_1_000_000_numbers() {
        final double[] input = input(1_000_000);
        final double[] output = Exercise_1_4_16_ClosestPairs.closestPairs(input);
        assertArrayEquals(new double[]{999_999.9, 1_000_000.0}, output, 0.1);
    }

    private static double[] input(final int size) {
        final double[] input = new double[size];
        for (int i = 0; i < size; i++) {
            input[i] = (double) i + 1;
        }
        input[size - 2] = input[size - 1] - 0.1;
        return input;
    }

}
