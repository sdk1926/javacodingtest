package boj.투포인터.배열합치기11728;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

        int[] firstArray = new int[first];
        int[] secondArray = new int[second];
        for (int i =0;i<first;i++){
            firstArray[i] = sc.nextInt();
        }
        for (int i=0;i < second;i++){
            secondArray[i] = sc.nextInt();
        }
        ArrayList<Integer> answer = new ArrayList<Integer>();

        int p1 = 0;
        int p2 = 0;

        while (firstArray.length > p1 && secondArray.length > p2){
            if (firstArray[p1] >= secondArray[p2]) {
                answer.add(secondArray[p2]);
                p2 += 1;
            } else {
                answer.add(firstArray[p1]);
                p1 += 1;
            }
        }
        while (firstArray.length > p1) {
            answer.add(firstArray[p1]);
            p1 += 1;
        }
        while (secondArray.length > p2) {
            answer.add(secondArray[p2]);
            p2 += 1;
        }

        StringBuilder sb = new StringBuilder();

        for (int p = 0; p <answer.size() ; p++) {
            sb.append(answer.get(p) + " ");
        }
        System.out.println(sb.toString());
    }
}
