package graduation_tasks;

import java.util.*;
import java.io.*;

public class Task4 {
    public static void run(Scanner sc, PrintWriter pw) {
        System.out.print("Enter string: ");
        String s = sc.nextLine();

        long count = s.chars().filter(Character::isUpperCase).count();
        String result = "Number of capital letters: " + count;
        System.out.println(result);
        pw.println(result);
    }
}