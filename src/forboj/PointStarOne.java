package forboj;

import java.util.Scanner;

public class PointStarOne {

    public static void main(String[] args){
        String str = "*";
        String space = " ";
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i < n+1; i++) {
            String empty = space.repeat(n-i);
            String repeated = str.repeat(i);
            System.out.println(empty+repeated);
        }
    }
}
