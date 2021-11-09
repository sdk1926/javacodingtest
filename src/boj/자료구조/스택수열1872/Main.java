package boj.자료구조.스택수열1872;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        int N = in.nextInt();
        int start = 0;

        while(N -- > 0) {
            int value = in.nextInt();
            if(value > start) {
                // start + 1부터 입력받은 value 까지 push를 한다.
                for(int i = start+1;i<=value;i++){
                    stack.push(i);
                    sb.append('+').append('\n'); // + 를 저장한다.
                }
                start = value;
            }
            else if (stack.peek() != value){
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append('-').append('\n');
        }
        System.out.println(sb);

    }
}
