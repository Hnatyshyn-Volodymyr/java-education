package graduation_tasks;

import java.util.*;
import java.io.*;

public class Task3 {
    public static void run(Scanner sc, PrintWriter pw) {
        System.out.print("Enter dollar rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter money in UAH: ");
        double uah = sc.nextDouble(); sc.nextLine();

        int dollars = (int)(uah / rate);
        double change = uah - dollars * rate;

        String result = String.format("You can buy: %d dollars, change: %.2f UAH", dollars, change);
        System.out.println(result);
        pw.println(result);
    }
}