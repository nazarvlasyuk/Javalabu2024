package Labka2;

public class Laba2 {
    public static void main(String[] args) {

        // Тести для першого завдання
        System.out.println("Task 1 Results:");
        printResultsTask1(2, 10);  // z = 2, k = 10
        printResultsTask1(1.5, 5);  // z = 1.5, k = 5
        printResultsTask1(3, 14);  // z = 3, k = 14
        printResultsTask1(3, 15);  // Неправильний аргумент для k

        // Тести для другого завдання
        System.out.println("\nTask 2 Results:");
        printResultsTask2(10, 2);  // t = 10, l = 2 (парне)
        printResultsTask2(10, 3);  // t = 10, l = 3 (непарне)
        printResultsTask2(5, 6);  // t = 5, l = 6 (парне)

        // Тести для третього завдання
        System.out.println("\nTask 3 Results:");
        printResultsTask3(0.001);  // epsilon = 0.001
        printResultsTask3(0.0001);  // epsilon = 0.0001
        printResultsTask3(-0.01);  // Неправильний аргумент для epsilon
    }

    // Завдання 1: Метод для обчислення суми ряду
    public static double calculateSumTask1(double z, int k) {
        if (k >= 15) {
            throw new IllegalArgumentException("k має бути < 15");
        }
        double sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += (1 / Math.sqrt(z * i)) + Math.tan((double) k / i);
        }
        return sum;
    }

    // Допоміжний метод для виведення результатів завдання 1
    public static void printResultsTask1(double z, int k) {
        try {
            System.out.println("z = " + z + ", k = " + k + ", result = " + calculateSumTask1(z, k));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }

    // Завдання 2: Метод для обчислення значення функції x(t, l)
    public static int calculateFunctionTask2(double t, int l) {
        if (l % 2 == 0) {
            return 6 - (l % 6);  // Парне: 6, 4, 2
        } else {
            return 5 - (l % 5);  // Непарне: 5, 3, 1
        }
    }

    // Допоміжний метод для виведення результатів завдання 2
    public static void printResultsTask2(double t, int l) {
        try {
            System.out.println("t = " + t + ", l = " + l + ", result = " + calculateFunctionTask2(t, l));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }

    // Завдання 3: Метод для обчислення нескінченної суми
    public static double calculateInfiniteSumTask3(double epsilon) {
        if (epsilon <= 0) {
            throw new IllegalArgumentException("epsilon має бути > 0");
        }
        double sum = 0;
        int i = 1;
        double term;
        do {
            term = Math.pow(-1, i) / factorial(i);
            sum += term;
            i++;
        } while (Math.abs(term) >= epsilon);
        return sum;
    }

    // Метод для обчислення факторіалу
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Допоміжний метод для виведення результатів завдання 3
    public static void printResultsTask3(double epsilon) {
        try {
            System.out.println("epsilon = " + epsilon + ", result = " + calculateInfiniteSumTask3(epsilon));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
