package forboj;

import java.util.Scanner;

public class LetterX {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            arr[i] = m;
        }
        for (int j = 0; j < n; j++){
            if(arr[j]<x){
                System.out.println(arr[j]);
            }
        }
    }
}