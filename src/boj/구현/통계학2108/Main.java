package boj.구현.통계학2108;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i=0;i<N;i++) {
            array.add(sc.nextInt());
        }
        int sum =0;
        for(int i:array) {
            sum += i;
        }
        double M = (double)N;
        double avreage = sum / M;
        int index = N/2 ;
        Collections.sort(array);
        int[] list = new int[N];
        int i = 0;
        System.out.println(Math.round(avreage));
        System.out.println(array.get(index));
        System.out.println(Collections.max(array)-Collections.min(array));

    }
}
