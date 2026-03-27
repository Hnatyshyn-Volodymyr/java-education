package graduation_tasks;

import java.util.*;
import java.io.*;

public class Task2 {
    public static void run(Scanner sc, PrintWriter pw) {
        System.out.print("Enter number: ");
        int n = sc.nextInt(); sc.nextLine();

        Map<Integer, Integer> factors = new LinkedHashMap<>();
        int num = n;
        for (int i = 2; i <= num / i; i++) {
            while (n % i == 0) {
                factors.put(i, factors.getOrDefault(i, 0) + 1);
                n /= i;
            }
        }
        if (n > 1) factors.put(n, factors.getOrDefault(n, 0) + 1);

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, Integer> e : factors.entrySet()) {
            sb.append(e.getKey());
            if (e.getValue() > 1) sb.append("^").append(e.getValue());
            sb.append(", ");
        }
        if (sb.length() >= 2) sb.setLength(sb.length() - 2);

        System.out.println("Prime factors: " + sb);
        pw.println("Prime factors: " + sb);
    }
}