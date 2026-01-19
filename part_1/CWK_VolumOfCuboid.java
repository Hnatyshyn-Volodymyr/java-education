package part_1;

import java.util.Scanner;

public class CWK_VolumOfCuboid {
	
	public static double getVolumeOfCuboid(final double length, final double width, final double height) { return length * width * height; }
	
	public static void main(String []args) {
		
		try(Scanner scanner = new Scanner(System.in)){
			
			System.out.printf("Enter length = ");
			double lenght = scanner.nextDouble();
			
			System.out.printf("Enter width = ");
			double width= scanner.nextDouble();
			
			System.out.printf("Enter height = ");
			double height = scanner.nextDouble();
			
			System.out.printf("Volum of cuboid = %s", getVolumeOfCuboid(lenght, width, height));
		}
	}
}
