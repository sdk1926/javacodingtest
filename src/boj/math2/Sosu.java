package boj.math2;
import java.util.Scanner;
import java.util.ArrayList;
public class Sosu {
    public boolean sosu(int n){
        if (n < 2) {
            return false;
        }
        int to = (int) Math.sqrt(n) + 1;
        for (int i=2; i < to; i++) {
            if ((n % i) == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Sosu is_sosu = new Sosu();
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int count = 0;
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = min; i < max +1; i++){
            if (is_sosu.sosu(i)){
                count += i;
                list1.add(i);
            }
        }
        if (count == 0){
            System.out.println(-1);
        }
        else {
            System.out.println(count);
            System.out.println(list1.get(0));
        }
    }
}