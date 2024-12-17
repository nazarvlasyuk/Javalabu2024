package Labka5;

public class Task1 {
    public static String intToOctString(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("The number must be non-negative.");
        }
        return Integer.toOctalString(i);
    }

    public static void main(String[] args) {
        System.out.println(intToOctString(511)); // Очікуваний результат: "777"
        System.out.println(intToOctString(64));  // Очікуваний результат: "100"
        System.out.println(intToOctString(0));   // Очікуваний результат: "0"

        try {
            System.out.println(intToOctString(-5));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
