package boj.구현.단어뒤집기_9093;

import java.util.Scanner;

// Main은 시간초과 안나는 풀이 법
public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        String[] arr = new String[number];
        for(int i=0;i<number;i++){
            arr[i] = sc.nextLine();
        }
        for(int i=0;i<number;i++) {
            String[] tmp = arr[i].split(" ");
            for (int j =0;j<tmp.length;j++) {
                int size = tmp[j].length()-1;
                String s2 = "";
                while (size >=0) {
                    s2 = s2+tmp[j].charAt(size--);
                }
                System.out.print(s2+" ");
            }
            System.out.println();
        }
    }
}
