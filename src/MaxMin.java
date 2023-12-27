
import java.util.*;
public class MaxMin {
    public static <T extends Comparable<T>> T findMax(T... elements) {
        if (elements == null || elements.length == 0) {
            return null;
        }

        Arrays.sort(elements);
        return elements[elements.length - 1]; // The last element is the largest after sorting
    }

    // Generic method to print the maximum element
    public static <T extends Comparable<T>> void printMax(T... elements) {
        T maxElement = findMax(elements);
        if (maxElement != null) {
            System.out.println("Maximum: " + maxElement);
        } else {
            System.out.println("No maximum found (empty or null input)");
        }
    }
}