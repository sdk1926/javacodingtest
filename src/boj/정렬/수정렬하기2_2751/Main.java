package boj.정렬.수정렬하기2_2751;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arrays = new ArrayList<Integer>();
        int N = sc.nextInt();
        for (int i=0;i<N;i++){
            arrays.add(sc.nextInt());
        }
        Collections.sort(arrays);
        for (int i:arrays){
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}
