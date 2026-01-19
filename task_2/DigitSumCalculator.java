package task_2;

import java.util.Scanner;

public class DigitSumCalculator {
	
	public static int calculateDigitSum(int number) {
		if(number < 100 || number > 999) {
			throw new IllegalArgumentException("Number must be a three-digit positive integer");
		}
		
		return number / 100 + (number / 10) % 10 + number % 10;
	}
	
	public static void main(String []args) {
		try(Scanner scanner = new Scanner(System.in)){
			System.out.println("Enter your three-digit possitive integer: ");
			int number = scanner.nextInt();
			System.out.printf("The sum of these digits is: %d", calculateDigitSum(number));
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}