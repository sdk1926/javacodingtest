package boj.정렬.일곱난쟁이2309;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 9;
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i =0;i<N;i++) {
            array.add(sc.nextInt());
        }
        int sum = 0;
        for (int i:array){
            sum += i;
        }
        int difference = sum - 100;
        int chai = 0;
        int removeEl;
        int index = 0;
        for (int i =0; i<N;i++) {
            index = i;
            chai = difference-array.get(i);
            int inde = array.indexOf(chai);
            if (inde != -1 && chai != array.get(i)) {
                break;
            }
        }
        array.remove(index);
        chai = array.indexOf(chai);
        array.remove(chai);
        Collections.sort(array);
        for (int i:array){
            System.out.print(i+" ");
        }
    }
}
