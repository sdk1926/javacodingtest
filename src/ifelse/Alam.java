package ifelse;

import java.util.Scanner;


import java.util.Scanner;

public class Alam {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int time, min, num;
        time = sc.nextInt();
        min  = sc.nextInt();
        num  = min - 45;
        if(num>=0){
            System.out.println(time+" "+num);
        }
        else if(num < 0 && time != 0){
            time -= 1;
            min = 60 + num;
            System.out.println(time+" "+min);
        }
        else{
            time = 23;
            min = 60 + num;
            System.out.println(time+" "+min);
        }
    }
}
