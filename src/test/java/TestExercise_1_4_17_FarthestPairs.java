import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public final class TestExercise_1_4_17_FarthestPairs {

    @Test
    public void farthestPairs_with_6_numbers() {
        final double[] input = new double[]{1.0, 2.0, 3.0, 0.1, 5.0, 6.0};
        final double[] output = Exercise_1_4_17_FarthestPairs.farthestPairs(input);
        assertArrayEquals(new double[]{0.1, 6.0}, output, 0.1);
    }

    @Test
    public void farthestPairs_with_100_000_numbers() {
        final int size = 100_000;
        final double[] output = Exercise_1_4_17_FarthestPairs.farthestPairs(input(size));
        assertArrayEquals(new double[]{0, size}, output, 0.1);
    }

    @Test
    public void farthestPairs_with_1_000_000_numbers() {
        final int size = 1_000_000;
        final double[] output = Exercise_1_4_17_FarthestPairs.farthestPairs(input(size));
        assertArrayEquals(new double[]{0, size}, output, 0.1);
    }

    @Test
    public void farthestPairs_with_10_000_000_numbers() {
        final int size = 10_000_000;
        final double[] output = Exercise_1_4_17_FarthestPairs.farthestPairs(input(size));
        assertArrayEquals(new double[]{0, size}, output, 0.1);
    }

    private static double[] input(final int size) {
        final double[] input = new double[size];
        for (int i = 0; i < size; i++) {
            input[i] = (double) i + 1;
        }
        input[size - 2] = 0;
        return input;
    }

}
