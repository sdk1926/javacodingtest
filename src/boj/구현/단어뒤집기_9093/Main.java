package boj.구현.단어뒤집기_9093;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<num;i++){
            String s = sc.nextLine();
            String[] array = s.split("");
            Stack<String> array2 = new Stack<>();
            for (int j = 0; j < array.length; j++){
                if (array[j].isBlank()){
                    while(!array2.empty()){
                        System.out.print(array2.pop());
                    }
                    System.out.print(" ");
                }
                else {
                    array2.push(array[j]);
                }
                if (j == array.length-1){
                    while(!array2.empty()){
                        System.out.print(array2.pop());
                    }
                    System.out.print("\n");
                }
            }

        }
    }
}
