/*
    Marcin Słowiak
    rozwiązanie zadania nr. 1909 - http://pl.spoj.com/problems/KC008/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        long totalSum = 0;
        long partSum = 0;
        while(in.hasNextLong()){
            long number = in.nextLong();
            if(number == 0){
                totalSum = totalSum + partSum;
                System.out.println(partSum);
                partSum = 0;
            }
            partSum = partSum + number;

        }
        System.out.println(totalSum);
    }
}
