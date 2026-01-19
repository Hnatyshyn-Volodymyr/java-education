package task_2;

import java.util.Scanner;

public class TemperatureConverter {
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5.0 / 9.0;
	}
	
	public static void main(String []args) {

		try(Scanner scanner = new Scanner(System.in)){
			
			System.out.println("Enter temperature in fahrenheit: ");
			double fahrenheit = scanner.nextDouble();
			System.out.printf("Temperature in Celsius: %.2f", fahrenheitToCelsius(fahrenheit));
		}
	}
}
