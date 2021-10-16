package boj.투포인터.수들의합2018;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int left = N-1;
        int right = N;
        int p1 = 1;
        int p2 = 2;
        int answer = 1;
        int cnt = 3;
        while (p1<left && p2<right){
            if (cnt < N) {
                p2 +=1;
                cnt += p2;
            }
            else{
                if (cnt == N){
                    answer += 1;
                }
                cnt -= p1;
                p1 += 1;
            }
        }
        System.out.println(answer);
    }
}
