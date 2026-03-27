package graduation_tasks;

import java.util.*;
import java.io.*;

public class Task5 {
    public static void run(Scanner sc, PrintWriter pw) {
        System.out.print("Enter string: ");
        String s = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = new StringBuilder(s).reverse().toString().equals(s);
        String result = "Palindrome: " + isPalindrome;
        System.out.println(result);
        pw.println(result);
    }
}