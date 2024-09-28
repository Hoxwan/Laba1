package com.example;



public class Main {
    public static void main(String[] args) {
        //Вызов FizzBuzz
        System.out.println("=== FizzBuzz ===");
        FizzBuzz.main(args);

        //Вызов ReverseString
        System.out.println("=== ReverseString ===");
        ReverseString.main(args);

        //Вызов QuadraticEquation
        System.out.println("=== QuadraticEquation ===");
//        QuadraticEquation.main(args);

        //Вызов SeriesSum
        System.out.println("=== SeriesSum ===");
        SeriesSum.main(args);

        //Вызов PalindromeChecker
        System.out.println("=== PalindromeChecker ===");
        PalindromeChecker.main(args);
    }

    public static double[] findRoots(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant >= 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return new double[]{root1, root2};
        } else {
            return null;
        }
    }

    public static class FizzBuzz {
        public static void main(String[] args) {
            for (int i = 1; i <= 500; i++) {
                System.out.println(fizzBuzz(i));
            }
        }

        public static String fizzBuzz(int number) {
            if (number % 5 == 0 && number % 7 == 0) {
                return "fizzbuzz";
            } else if (number % 5 == 0) {
                return "fizz";
            } else if (number % 7 == 0) {
                return "buzz";
            } else {
                return String.valueOf(number);
            }
        }
    }

    public static class ReverseString {
        public static void main(String[] args) {
            String str = "make install";
            System.out.println(reverseString(str));
        }

        public static String reverseString(String str) {
            StringBuilder reversed = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                reversed.append(str.charAt(i));
            }
            return reversed.toString();
        }
    }

    public static class SeriesSum {
        public static void main(String[] args) {
            double sum = calculateSeriesSum();
            System.out.println("Сумма ряда: " + sum);
        }

        public static double calculateSeriesSum() {
            double sum = 0.0;
            for (int n = 2; ; n++) {
                double term = 1.0 / (Math.pow(n, 2) + n - 2);
                if (term < 1e-6) {
                    break;
                }
                sum += term;
            }
            return sum;
        }
    }

    public static class PalindromeChecker {
        public static void main(String[] args) {
            String str = "madam";
            System.out.println(isPalindrome(str) ? "Палиндром" : "Не палиндром");
        }

        public static boolean isPalindrome(String str) {
            int left = 0;
            int right = str.length() - 1;
            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }
}
