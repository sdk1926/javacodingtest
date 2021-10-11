package boj.heap;

import java.io.*;
import java.util.*;

public class Heap1655 {
    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> maxQ=new PriorityQueue<>((a,b) -> b-a);
        PriorityQueue<Integer> minQ=new PriorityQueue<>((a,b) -> a-b);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(br.readLine());
        for (int i =0; i<n; i++) {
            int m = Integer.parseInt(br.readLine());
            if(i%2==0)
                maxQ.add(m);
            else
                minQ.add(m);

            if(maxQ.size()!=0 && minQ.size()!=0) {
                if(maxQ.peek()>minQ.peek()) {
                    int temp=maxQ.poll();
                    minQ.add(temp);
                    maxQ.add(minQ.poll());
                }
            }
            sb.append(maxQ.peek() + "\n");

        }
        System.out.print(sb);
    }
}
