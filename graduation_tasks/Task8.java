package graduation_tasks;

import java.util.*;
import java.io.*;

public class Task8 {
    static String[] below20 = {"","one","two","three","four","five","six","seven","eight","nine","ten",
                                "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    static String[] tens = {"","", "twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};

    public static String numberToWords(int n) {
        if (n == 0) return "zero";
        if (n < 20) return below20[n];
        if (n < 100) return tens[n/10] + (n%10>0?" "+below20[n%10]:"");
        if (n < 1000) return below20[n/100]+" hundred"+(n%100>0?" "+numberToWords(n%100):"");
        if (n < 1000000) return numberToWords(n/1000)+" thousand"+(n%1000>0?" "+numberToWords(n%1000):"");
        return "";
    }

    public static void run(Scanner sc, PrintWriter pw) {
        System.out.print("Enter number (1..1000000): ");
        int n = sc.nextInt(); sc.nextLine();

        String result = numberToWords(n);
        System.out.println(result);
        pw.println(result);
    }
}