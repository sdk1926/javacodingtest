package boj.정렬.소트인사이드;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String se = sc.nextLine();
        String[] sw = se.split("");
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (String s:sw){
            int a = Integer.parseInt(s);
            array.add(a);
        }
        Collections.sort(array);
        Collections.reverse(array);
        for (int i:array){
            String sv = Integer.toString(i);
            sb.append(sv);
        }
        System.out.println(sb);
    }
}
