package graduation_tasks;

import java.util.*;
import java.io.*;

public class Task6 {
    public static void run(Scanner sc, PrintWriter pw) {
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        long words = Arrays.stream(text.trim().split("\\s+")).filter(w -> !w.isEmpty()).count();
        String result = "Number of words: " + words;
        System.out.println(result);
        pw.println(result);
    }
}