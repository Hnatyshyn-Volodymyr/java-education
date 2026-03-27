package graduation_tasks;

import java.util.*;
import java.io.*;

public class Task7 {
    public static void run(Scanner sc, PrintWriter pw) {
        System.out.print("Enter n: ");
        int n = sc.nextInt(); sc.nextLine();

        long fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;

        String result = n + "! = " + fact;
        System.out.println(result);
        pw.println(result);
    }
}