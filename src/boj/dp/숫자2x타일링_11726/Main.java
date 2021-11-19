package boj.dp.숫자2x타일링_11726;

import java.util.Scanner;

public class Main {

    static int N;
    static int[] dp;

    static void input(){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        dp = new int[N+1];
    }

    static int add(int n){
        if (n == 1){
            return 1;
        } if (n == 2) {
            return 2;
        } return dp[n-2] + dp[n-1];

    }

    public static void main(String[] args) {
        input();
        for (int i = 1 ;i <= N; i++) {
            dp[i] = add(i) % 10007;
        }
        int ans = dp[N] % 10007;
        System.out.println(ans);
    }
}
