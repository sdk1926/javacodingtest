package forboj;

import java.util.Scanner;

public class PrintAbEight {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<n+1;i++){
            int j = sc.nextInt();
            int k = sc.nextInt();
            System.out.println("Case #"+i+": "+j+" "+"+ "+k+" = "+(j+k));
        }

    }

}
