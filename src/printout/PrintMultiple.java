package printout;

import java.util.Scanner;

public class PrintMultiple {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = b;
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++){
            arr[i] = c%10;
            c /= 10;
        }
        System.out.println(a*arr[0]);
        System.out.println(a*arr[1]);
        System.out.println(a*arr[2]);
        System.out.println(b*a);

    }
}
