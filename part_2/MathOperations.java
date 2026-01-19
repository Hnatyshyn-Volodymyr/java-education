package part_2;

import java.util.Scanner;

public class MathOperations {
	
	public static double calculateSquareRoot(double number) { 
		if(number < 0) {throw new IllegalArgumentException("Number must be possitive");}
		
		return Math.sqrt(number); 
	}
	
	public static double calculateSquare(double number) { return Math.pow(number, 2); }
	
	public static double calculateCube(double number) { return Math.pow(number, 3); }
	
	public static void main(String []args) {
		
		try(Scanner scanner = new Scanner(System.in)){
			
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();

            System.out.printf("Square root: %.2f%n", calculateSquareRoot(number));
            System.out.printf("Square: %.2f%n", calculateSquare(number));
            System.out.printf("Cube: %.2f%n", calculateCube(number));
            
		} catch (IllegalArgumentException e) {System.out.printf("Error: %s", e.getMessage()); 
		} catch (Exception e) {System.out.println("Invalid input. Please enter a number.");}
		
	}
}
