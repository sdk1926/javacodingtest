package boj.구현.제로10773;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<N;i++){
            int a = sc.nextInt();
            if (a == 0){
                stack.pop();
            }
            else {
                stack.push(a);
            }
        }
        int sum =0;
        for (int i: stack){
            sum += i;
        }
        System.out.println(sum);
    }
}
