package Labka1;

public class Laba1 {
        public static void main(String[] args) {

            // Данные для формулы 7
            double a1 = -3.45;
            double b1 = 2.34;
            double c1 = 1.45;
            double d1 = 0.83;

            // Формула 7: y = (4 * ch(sqrt(abs(a) / abs(b))) + 3 * arccos(d)) ^ c
            double y1 = Math.pow(4 * Math.cosh(Math.sqrt(Math.abs(a1) / Math.abs(b1))) + 3 * Math.acos(d1), c1);
            System.out.println("Значение y для первой формулы (7): " + y1);


            // Данные для формулы 8
            double a2 = 0.345;
            double b2 = -2.25;
            double c2 = 2.65;
            double d2 = 3.99;

            // Формула 8: y = (5 * a / sin(a)) + sqrt(tanh(abs(b) * c) / ln(d))
            double y2 = (5 * a2 / Math.sin(a2)) + Math.sqrt(Math.tanh(Math.abs(b2) * c2) / Math.log(d2));
            System.out.println("Значение y для второй формулы (8): " + y2);


            // Данные для формулы 9
            double a3 = -2.98;
            double b3 = 5.55;
            double c3 = 0.045;
            double d3 = 0.129;

            // Формула 9: y = (sin(abs(a)) + cos(sqrt(b))) / (2 * tan(c) + exp(d))
            double y3 = (Math.sin(Math.abs(a3)) + Math.cos(Math.sqrt(b3))) / (2 * Math.tan(c3) + Math.exp(d3));
            System.out.println("Значение y для третьей формулы (9): " + y3);
        }
    }