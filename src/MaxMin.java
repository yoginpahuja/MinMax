

public class MaxMin {
    public static <T extends Comparable<T>> T findMax(T x, T y, T z) {
        T max = x; // Assume x is initially the largest

        if (y.compareTo(max) > 0) {
            max = y; // y is larger
        }
        if (z.compareTo(max) > 0) {
            max = z; // z is larger
        }

        return max;
    }
}