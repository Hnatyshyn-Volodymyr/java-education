package graduation_tasks;

import java.util.*;
import java.io.*;

public class Task11 {
    public static boolean checkLuhn(String cc) {
        int sum=0;
        boolean alt=false;
        for (int i=cc.length()-1;i>=0;i--) {
            int n = Integer.parseInt(cc.substring(i,i+1));
            if (alt) { n*=2; if (n>9) n-=9; }
            sum+=n;
            alt=!alt;
        }
        return sum%10==0;
    }

    public static void run(Scanner sc, PrintWriter pw) {
        System.out.print("Enter credit card number: ");
        String cc = sc.nextLine().replaceAll("\\s+","");
        boolean valid = checkLuhn(cc);

        String result = "Valid: " + valid;
        System.out.println(result);
        pw.println(result);
    }
}