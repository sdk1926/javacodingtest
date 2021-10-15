package boj.구현.이천칠년_1924;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month;
        int day;
        month = sc.nextInt();
        day = sc.nextInt();

        int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
        int days = 0;
        for (int i =1;i<13;i++){
            if (i == month) break;
            days += months[i-1];
        }
        int answer = (days+day)%7;
        String realAnswer = "";
        switch (answer){
            case 0 : realAnswer = "SUN";
            break;
            case 1 : realAnswer = "MON";
            break;
            case 2 : realAnswer = "TUE";
            break;
            case 3 : realAnswer = "WED";
            break;
            case 4 : realAnswer = "THU";
            break;
            case 5 : realAnswer = "FRI";
            break;
            case 6 : realAnswer = "SAT";
            break;
        }
        System.out.println(realAnswer);
    }
}
