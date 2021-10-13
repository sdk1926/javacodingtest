package boj.recursion.하노이의11729;

import java.util.Scanner;

public class Main {

    static void hanooi(int num, int start, int second, int end){
        if (num == 1) {
            System.out.println(start+" "+end);
        }
        else {
            hanooi(num-1, start, end, second);
            System.out.println(start+" "+end);
            hanooi(num-1, second, start, end);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(((int)Math.pow(2,n))-1);
        hanooi(n,1,2,3);
    }
}
