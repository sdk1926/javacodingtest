package ifelse;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        if (90 <= num) {
            System.out.println("A");
        }
        else if( 80 <= num){
            System.out.println("B");
        }
        else if( 70 <= num){
            System.out.println("C");
        }
        else if(60 <= num){
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
        // 다른 풀이
        //System.out.print((A>=90)?"A": (A>=80)? "B": (A>=70)? "C": (A>=60)? "D": "F");
    }

}
