package boj.자료구조.에디터1406;

import java.util.LinkedList;
import java.util.Scanner;
// https://minhamina.tistory.com/17 참고 하기
public class Main {

    public static void main(String[] args) {
        LinkedList<String> stack = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());
        String[] sa = s.split("");
        for(String d:sa){
            stack.add(d);
        }
        int length = stack.size();
        int cursor = stack.size();
        for(int i=0;i<n;i++) {
            String move = sc.nextLine();
            if (move.substring(0,1).equals("L") && cursor != 0) {
                cursor -= 1;
            }
            else if (move.substring(0,1).equals("D") && cursor != length){
                cursor += 1;
            }
            else if (move.substring(0,1).equals("B") && cursor != 0) {
                stack.remove(cursor-1);
                length -= 1;
                cursor -= 1;
            }
            else if (move.substring(0,1).equals("P")) {
//                if (cursor == 0) {
//                    stack.add(0,move.substring(2));
//                    cursor += 1;
//                }
//                else {
                stack.add(cursor,move.substring(2));
                cursor+=1;
//                }
            }
        }
        for(String sde:stack){
            System.out.print(sde);
        }

    }
}
