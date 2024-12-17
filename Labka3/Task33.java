package Labka3;

// Task 33: Find the sum of the second and the largest positive elements in an array
public class Task33 {
    public static void main(String[] args) {
        int[] array = {3, 5, -2, 9, 0, -8};
        try {
            System.out.println("Sum of second and largest positive elements: " + findSum(array));
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    public static int findSum(int[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Array must not be null and must have at least two elements");
        }

        int maxPositive = Integer.MIN_VALUE;
        int secondPositive = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > 0) {
                if (num > maxPositive) {
                    secondPositive = maxPositive;
                    maxPositive = num;
                } else if (num > secondPositive) {
                    secondPositive = num;
                }
            }
        }

        if (secondPositive == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Array must contain at least two positive numbers");
        }

        return maxPositive + secondPositive;
    }
}

