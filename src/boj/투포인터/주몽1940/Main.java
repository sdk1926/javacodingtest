package boj.투포인터.주몽1940;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int target = sc.nextInt();
        int[] lists = new int[N];
        for (int i =0;i<N;i++) {
            lists[i] = sc.nextInt();
        }
        Arrays.sort(lists);
        int p1 = 0;
        int p2 = lists.length -1;
        int ans = 0;
        while (p1 != p2){
            if (lists[p1]+lists[p2] > target) {
                p2 -= 1;
            }
            else {
                if (lists[p1]+lists[p2] == target) {
                    ans += 1;
                }
                p1 += 1;
            }
        }
        System.out.println(ans);
    }
}
