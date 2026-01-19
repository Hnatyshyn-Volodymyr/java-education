package part_1;

import java.util.Scanner;

public class UserInfo {

	public static void main(String [] args) {
		
		try(Scanner scanner = new Scanner(System.in)){
			
			System.out.println("Hello! What's your name?");
			String name = scanner.nextLine();
			
			while(name.isBlank()) {
				
				System.out.println("Name cannot be empty. Please enter your name:");
				name = scanner.nextLine();
				
			}
			
			System.out.printf("Where do you live, %s?%n", name);
			String address = scanner.nextLine();
			
			System.out.printf("Name: %s, Address: %s", name, address);
		}
	}
}