package part_1;

import java.util.Scanner;

public class FlowerBedCalculator {	
	
	public static void main(String[] args) {	
		
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the radius of the flower bed: ");
            int radius = scanner.nextInt();

            double perimeter = 2 * Math.PI * radius;
            double area = Math.PI * Math.pow(radius, 2);

            System.out.printf("Perimeter of Flower Bed = %.3f%n", perimeter);
            System.out.printf("Area of Flower Bed = %.3f%n", area);
        }
	}
}