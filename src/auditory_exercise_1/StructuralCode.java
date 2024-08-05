// 2021
package auditory_exercise_1;

import java.util.Scanner;

public class StructuralCode {
    // Count all the number between a and b which are divisible with the sum of their digits
    public static int function(int a, int b) {
        int counter = 0;
        for (int i = a; i <= b; i++) {
            if (i % getSumOfDigits(i) == 0) {
                ++counter;
            }
        }
        return counter;
    }

    private static int getSumOfDigits(int n) {
        int sumOfDigits = 0;
        while (n > 0) {
            sumOfDigits += (n % 10);
            n /= 10;
        }
        return sumOfDigits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Внеси ја почетната вредност a: ");
        int a = scanner.nextInt();

        System.out.print("Внеси ја крајната вредност b: ");
        int b = scanner.nextInt();

        int result = function(a, b);
        System.out.println("Бројот на броеви помеѓу " + a + " и " + b + " кои се деливи со збирот на нивните цифри е: " + result);
    }
}