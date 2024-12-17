package Labka3;

// Task 63: Modify array as described
public class Task63 {
    public static void main(String[] args) {
        int[] array = {-3, 0, 5, -1, 4, 0};
        try {
            int[] modifiedArray = modifyArray(array);
            System.out.print("Modified array: ");
            for (int num : modifiedArray) {
                System.out.print(num + " ");
            }
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    public static int[] modifyArray(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int max = Integer.MIN_VALUE;

        // Find the maximum element in the array
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }

        // Modify the array as per the requirements
        int[] modifiedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                modifiedArray[i] = array[i] + max;
            } else if (array[i] == 0) {
                modifiedArray[i] = 1;
            } else {
                modifiedArray[i] = array[i] * 2;
            }
        }

        return modifiedArray;
    }
}
