package graduation_tasks;

import java.util.*;
import java.io.*;

public class Task14 {
    public static void run(Scanner sc, PrintWriter pw) {
        int[] coins={1,2,5,10,20,50,100,200};
        int target=200;
        long[] dp=new long[target+1];
        dp[0]=1;
        for(int c:coins) for(int i=c;i<=target;i++) dp[i]+=dp[i-c];
        String res="Ways to make £2: "+dp[target];
        System.out.println(res);
        pw.println(res);
    }
}