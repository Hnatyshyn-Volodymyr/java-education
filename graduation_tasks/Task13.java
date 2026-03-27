package graduation_tasks;

import java.util.*;
import java.io.*;

public class Task13 {
    public static long lcm(long a, long b) { return a*b/gcd(a,b); }
    public static long gcd(long a,long b){ return b==0?a:gcd(b,a%b); }

    public static void run(Scanner sc, PrintWriter pw) {
        long result=1;
        for(int i=1;i<=20;i++) result=lcm(result,i);
        String res="Smallest divisible by 1..20: "+result;
        System.out.println(res);
        pw.println(res);
    }
}