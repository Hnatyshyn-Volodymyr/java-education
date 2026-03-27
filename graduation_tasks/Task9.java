package graduation_tasks;

import java.util.*;
import java.io.*;

public class Task9 {
    public static int random01() {
        return new Random().nextInt(2);
    }

    public static void run(Scanner sc, PrintWriter pw) {
        System.out.print("Enter n: ");
        int n = sc.nextInt(); sc.nextLine();

        int ones = 0;
        for (int i=0;i<n;i++) if (random01()==1) ones++;

        String result = "Number of ones: " + ones;
        System.out.println(result);
        pw.println(result);
    }
}