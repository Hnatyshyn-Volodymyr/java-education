package graduation_tasks;

import java.util.*;
import java.io.*;

public class Task10 {
    public static void run(Scanner sc, PrintWriter pw) {
        System.out.print("Enter n (>1): ");
        long n = sc.nextLong(); sc.nextLine();

        int steps = 0;
        long x = n;
        while (x != 1) {
            if (x%2==0) x/=2; else x=x*3+1;
            steps++;
        }

        String result = "Steps to reach 1: " + steps;
        System.out.println(result);
        pw.println(result);
    }
}