package forboj;

import java.util.Scanner;

public class NPick {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0 ; i < n; i++){
            System.out.println(n-i);
        }
    }
}
