package Labka3;

// Task 3: Find the maximum element in an array
public class Task3 {
    public static void main(String[] args) {
        int[] array = {3, 5, -2, 9, 0, -8};
        try {
            System.out.println("Maximum element: " + findMax(array));
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
