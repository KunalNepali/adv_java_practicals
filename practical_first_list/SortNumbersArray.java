import java.util.Arrays;

public class SortNumbersArray {
    public static void main(String[] args) {
        int[] numbers = {43, 12, 89, 5, 33};

        System.out.println("Before sorting: " + Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println("After sorting: " + Arrays.toString(numbers));
    }
}