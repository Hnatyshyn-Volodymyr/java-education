package task_2;

import java.util.Scanner;

public class DigitSumCalculator {

    public static int sumOfPositiveDigits(int number) {

        if (number < 100 || number > 999) {
            throw new IllegalArgumentException("Number must be a three-digit positive integer.");
        }

        int digit1 = number / 100;          // сотни
        int digit2 = (number / 10) % 10;    // десятки
        int digit3 = number % 10;           // единицы

        return digit1 + digit2 + digit3;
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a three-digit number: ");
            int number = scanner.nextInt();

            int result = sumOfPositiveDigits(number);

            System.out.println("Sum of digits: " + result);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}