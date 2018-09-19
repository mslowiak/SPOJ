/*
    Marcin Słowiak
    rozwiązanie zadania nr. 549 - http://pl.spoj.com/problems/RNO_DOD/
*/

import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int amountOfData = in.nextInt();
        for(int i=0; i<amountOfData; ++i){
            int sum = 0;
            int amountOfNumber = in.nextInt();
            for(int j=0; j<amountOfNumber; ++j){
                sum = sum + in.nextInt();
            }
            System.out.println(sum);
        }
    }
}
