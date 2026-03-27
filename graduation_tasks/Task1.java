package graduation_tasks;

import java.util.*;
import java.io.*;

public class Task1 {
    public static void run(Scanner sc, PrintWriter pw) {
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); sc.nextLine();

        List<Long> fib = new ArrayList<>();
        long a = 1, b = 1;
        fib.add(a);
        if (n > 0) fib.add(b);

        for (int i = 2; i <= n; i++) {
            long c = a + b;
            fib.add(c);
            a = b; b = c;
        }

        System.out.println("Fibonacci: " + fib);
        pw.println("Fibonacci: " + fib);
    }
}