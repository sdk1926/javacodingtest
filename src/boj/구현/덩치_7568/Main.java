package boj.구현.덩치_7568;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] arr = new int[N][2];

        for (int i =0;i<N;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i][0] = a;
            arr[i][1] = b;
        }

        for (int i=0;i<N;i++){
            int rank= 1;
            for (int j=0;j<N;j++){
                if(i==j) continue;
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    rank++;
                }
            }
            System.out.print(rank+" ");
        }

    }
}

