package boj.구현.단어뒤집기_9093;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        String word;
        for (int i=0;i<num;i++){
            word = sc.next();
            String[] wordList = word.split(" ");
            System.out.println(wordList[2]);
        }

    }
}
