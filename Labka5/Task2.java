package Labka5;

public class Task2 {
    public static int countLetterDigitCombinations(String s) {
        if (s == null) {
            throw new NullPointerException("Input string cannot be null.");
        }

        String[] parts = s.split("\\s+");
        int count = 0;
        for (String part : parts) {
            if (part.matches(".*[a-zA-Z].*[0-9].*|.*[0-9].*[a-zA-Z].*")) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String test1 = "The user with the nickname koala757677 this month wrote 3 times more comments than the user with the nickname croco181dile920 4 months ago";
        String test2 = "123 456 abc def123 xyz456 def";
        String test3 = "simple text with no combinations";

        System.out.println(countLetterDigitCombinations(test1)); // Очікуваний результат: 2
        System.out.println(countLetterDigitCombinations(test2)); // Очікуваний результат: 2
        System.out.println(countLetterDigitCombinations(test3)); // Очікуваний результат: 0

        try {
            System.out.println(countLetterDigitCombinations(null));
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
