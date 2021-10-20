package boj.구현.요세푸스_11866;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        int index = sc.nextInt();
        sb.append("<");
        Queue<Integer> q = new LinkedList<>();
        for (int i=1;i<N+1;i++) {
            q.add(i);
        }
        while (q.size() > 1) {
            for (int i=0;i<index-1;i++){
                int a =q.poll();
                q.add(a);
            }
            sb.append(q.poll()).append(", ");
        }
        sb.append(q.poll()).append(">");
        System.out.println(sb);
    }
}

