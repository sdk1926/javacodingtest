package boj.dp.일로만들기_1463;

import java.util.Scanner;

public class Main {

//    static int N;
//    static int[] dp;

//    public static void input(){
//        Scanner sc = new Scanner(System.in);
//        N = sc.nextInt();
//        dp = new int[N+1];
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int dp[] = new int[number+1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2;i<=number;i++){
            dp[i] = dp[i-1] + 1;
            if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i/2] + 1);
            if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i/3] + 1);
        }
        System.out.println(dp[number]);
    }
}
