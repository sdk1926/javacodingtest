package boj.시뮬레이션.로봇청소기14503;

import java.util.Scanner;

public class Main {

    public static int[] directionRocation(int n){
        int[] array = new int[2];
        if (n == 0) {
            array[0] = -1;
            array[1] = 0;
            return array;
        } else if (n == 1) {
            array[0] = 0;
            array[1] = 1;
            return array;
        } else if (n == 2) {
            array[0] = 1;
            array[1] = 0;
            return array;
        } else {
            array[0] = 0;
            array[1] = -1;
            return array;
        }
    }
    static int translateDirection(int n) {
        if (n < 0) {
            return 3;
        }
        else {
            return n;
        }
    }
    static int[] bbaku(int num) {
        int[] array = new int[2];
        if (num == 0) {
            array[0] = 1;
            array[1] = 0;
            return array;
        } else if(num == 1) {
            array[0] = 0;
            array[1] = -1;
            return array;
        } else if (num == 2) {
            array[0] = -1;
            array[1] = 0;
            return array;
        } else {
            array[0] = 0;
            array[1] = 1;
            return array;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 1;
        int sero = sc.nextInt();
        int garo = sc.nextInt();
        int[][] room = new int[sero][garo];
        int[] robotLocation = new int[2];
        robotLocation[0] = sc.nextInt();
        robotLocation[1] = sc.nextInt();
        int direction = sc.nextInt();
        for (int i=0;i<sero;i++) {
            for (int j=0;j<garo;j++) {
                room[i][j] = sc.nextInt();
            }
        }
        room[robotLocation[0]][robotLocation[1]] = 2;
        int triger = 1;
        boolean flag = false;
        while (triger != 0) {
            for (int i=0;i<4;i++) {
                int d = direction;
                d -= 1;
                d = translateDirection(d);
                int[] moveLocation = directionRocation(d);
                int[] searchLocation = {robotLocation[0]+moveLocation[0], robotLocation[1]+moveLocation[1]};
                if (searchLocation[0] < 0 || searchLocation[0] > sero -1 ||
                    searchLocation[1] < 0 || searchLocation[1] > garo -1){
                    continue;
                }
                if (room[searchLocation[0]][searchLocation[1]] == 0){
                    room[searchLocation[0]][searchLocation[1]] = 1;
                    robotLocation[0] = searchLocation[0];
                    robotLocation[1] = searchLocation[1];
                    direction = d;
                    ans += 1;
                    flag = false;
                    break;
                }
                if (room[searchLocation[0]][searchLocation[1]] == 1){
                    direction = d;
                    flag = true;
                    continue;
                }
            }
            if (flag) {
                int[] moveLocation = bbaku(direction);
                int[] searchLocation = {robotLocation[0]+moveLocation[0], robotLocation[1]+moveLocation[1]};
                if (searchLocation[0] < 0 || searchLocation[0] > sero -1 ||
                        searchLocation[1] < 0 || searchLocation[1] > garo -1){
                    break;
                } else if (room[searchLocation[0]][searchLocation[1]] == 1){
                    break;
                } else if(room[searchLocation[0]][searchLocation[1]] == 0){
                    room[searchLocation[0]][searchLocation[1]] = 1;
                    robotLocation[0] = searchLocation[0];
                    robotLocation[1] = searchLocation[1];
                    ans += 1;
                    flag = false;
                }
            }
        }
    System.out.println(ans);
    }
}
