package Labka4;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        long[] array = {56, 12, 89, 3, 45, 7};
        System.out.println("Original array: " + Arrays.toString(array));

        bubbleSort(array);
        System.out.println("Sorted array (Bubble Sort): " + Arrays.toString(array));
    }

    public static void bubbleSort(long[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Обмін елементів
                    long temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
