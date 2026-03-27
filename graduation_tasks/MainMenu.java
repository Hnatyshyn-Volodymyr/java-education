package graduation_tasks;

import java.util.*;
import java.io.*;

public class MainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        String[] descriptions = {
            "Input number and generate Fibonacci sequence",
            "Input number and decompose into prime factors",
            "Convert UAH to dollars based on exchange rate",
            "Count number of capital letters in a string",
            "Check if a string is a palindrome",
            "Count number of words in a text",
            "Calculate factorial of a number",
            "Convert number to English words",
            "Generate 0 or 1 randomly n times and count ones",
            "Count steps to reach 1 using Collatz process",
            "Validate credit card number using Luhn algorithm",
            "Sum multiples of 3 or 5 below 1000",
            "Find smallest number divisible by 1..20",
            "Count ways to make £2 using coins"
        };

        System.out.println("Select a task (1-14), 0 to exit:");
        for (int i = 0; i < descriptions.length; i++) {
            System.out.println((i + 1) + ". " + descriptions[i]);
        }

        while (true) {
            System.out.print("\nEnter task number (0 to exit): ");
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Try again.");
                continue;
            }

            if (choice == 0) break;

            try (PrintWriter pw = new PrintWriter(new FileWriter("output.txt", true))) {
                pw.println("Task " + choice + " result:");
                switch (choice) {
                    case 1: Task1.run(sc, pw); break;
                    case 2: Task2.run(sc, pw); break;
                    case 3: Task3.run(sc, pw); break;
                    case 4: Task4.run(sc, pw); break;
                    case 5: Task5.run(sc, pw); break;
                    case 6: Task6.run(sc, pw); break;
                    case 7: Task7.run(sc, pw); break;
                    case 8: Task8.run(sc, pw); break;
                    case 9: Task9.run(sc, pw); break;
                    case 10: Task10.run(sc, pw); break;
                    case 11: Task11.run(sc, pw); break;
                    case 12: Task12.run(sc, pw); break;
                    case 13: Task13.run(sc, pw); break;
                    case 14: Task14.run(sc, pw); break;
                    default:
                        System.out.println("Task not implemented yet.");
                }
                System.out.println("Result written to output.txt");
            } catch (IOException e) {
                System.out.println("File error: " + e.getMessage());
            }
        }

        System.out.println("Exiting program.");
        sc.close();
    }
}
