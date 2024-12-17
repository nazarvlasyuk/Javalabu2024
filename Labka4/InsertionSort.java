package Labka4;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        long[] array = {56, 12, 89, 3, 45, 7};
        System.out.println("Original array: " + Arrays.toString(array));

        insertionSort(array);
        System.out.println("Sorted array (Insertion Sort): " + Arrays.toString(array));
    }

    public static void insertionSort(long[] array) {
        for (int i = 1; i < array.length; i++) {
            long key = array[i];
            int j = i - 1;
            // Зсуваємо елементи, які більші за key
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
