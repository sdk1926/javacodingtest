package boj.복습.요세푸스_11866;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int N = sc.nextInt();
        int M = sc.nextInt();
        Queue<Integer> array = new LinkedList<>();
        for (int i=1;i<N+1;i++) {
            array.add(i);
        }
        while (array.size() > 1) {
            for (int i=1;i<M;i++){
                int a = array.poll();
                array.add(a);
            }
            sb.append(array.poll()+", ");
        }
        sb.append(array.poll()+">");
        System.out.println(sb);
    }
}

