package boj.dp.일로만들기2_12852;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dp = new int[N+1];
        int[] process = new int[N+1];
        dp[1] = 0;
        process[1] = -1;


        for (int i=2;i<N+1;i++) {
            dp[i] = dp[i-1]+1;
            process[i] = i - 1;
            if (i % 2 == 0 && dp[i] > dp[i/2]+1){
                dp[i] = dp[i/2]+1;
                process[i] = i / 2;
            }
            if (i % 3 == 0 && dp[i] > dp[i/3]+1) {
                dp[i] = dp[i/3]+1;
                process[i] = i/3;
            }
        }
        System.out.println(dp[N]);
        System.out.print(N+" ");
        while (N != 1){
            System.out.print(process[N]+" ");
            N = process[N];
        }
    }
}
