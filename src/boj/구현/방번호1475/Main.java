package boj.구현.방번호1475;

import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = Integer.toString(N);
        String[] se = s.split("");
        int[] array = {0,0,0,0,0,0,0,0,0};
        for (String a:se) {
            int b = Integer.parseInt(a);
            if (b == 9) {
                array[6] += 1;
            }
            else{
                array[b] += 1;
            }
        }
        if (array[6] % 2 == 1){
            array[6] += 1;
            array[6] = array[6] / 2;
        } else {
            array[6] = array[6] / 2;
        }
        int ans = 1;
        for (int i:array){
            if (i > ans){
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
