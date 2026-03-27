package graduation_tasks;

import java.util.*;
import java.io.*;

public class Task12 {
    public static void run(Scanner sc, PrintWriter pw) {
        int sum=0;
        for (int i=1;i<1000;i++) if (i%3==0 || i%5==0) sum+=i;
        String result="Sum of multiples of 3 or 5 below 1000: "+sum;
        System.out.println(result);
        pw.println(result);
    }
}