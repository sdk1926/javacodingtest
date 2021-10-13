package boj.복습.하노이의11729;

import java.util.Scanner;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    static void hanooi(int num, int start, int second, int end){
        if (num == 1) {
            sb.append(start+" "+end+"\n");
        }
        else {
            hanooi(num-1, start, end, second);
            sb.append(start+" "+end+"\n");
            hanooi(num-1, second, start, end);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sb.append((int) (Math.pow(2, n) - 1)).append('\n');
        hanooi(n,1,2,3);
        System.out.println(sb);
    }
}
