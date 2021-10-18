package boj.복습.수들의합2_2003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int target = sc.nextInt();
        int[] lists = new int[N];
        for (int i =0;i<N;i++){
            lists[i] = sc.nextInt();
        }

        int p1 = 0;
        int p2 = 0;
        int cnt = 0;
        int answ = 0;
        while (true) {
            if (cnt > target) {
                cnt -= lists[p1];
                p1 += 1;
            }
            else if ( p2 >= N) break;
            else {
                cnt += lists[p2];
                p2 += 1;
            }
            if (cnt == target) {
                answ += 1;
            }
        }
        System.out.println(answ);
    }

}
