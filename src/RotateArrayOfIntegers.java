import java.util.Arrays;

public class RotateArrayOfIntegers {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int positionsToRotate = 8;

        rotateLeft(array, positionsToRotate);
        System.out.println("Rotated Array = " + Arrays.toString(array));
    }

    public static void rotateLeft(int[] array, int positions) {
        int length = array.length;

        // Ensure positions >= 0
        positions = positions % length;
        if (positions <= 0) {
            throw new IllegalArgumentException("Positions to rotate can not be zero or negative.");
        }

        for (int i = 0; i < positions; i++) {
            int temp = array[0];

            // Rotate elements to the left
            for (int j = 1; j < length; j++) {
                array[j - 1] = array[j];
            }

            // First element will be at the end of the array
            array[length - 1] = temp;
        }
    }
}

