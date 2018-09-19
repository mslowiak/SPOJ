/*
    Marcin Słowiak
    rozwiązanie zadania nr. 606 - http://pl.spoj.com/problems/PP0502B/
*/

import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int amountOfData = in.nextInt();
        for(int i=0; i<amountOfData; ++i){
            int arraySize = in.nextInt();
            int [] array = new int[arraySize];

            for(int j=0; j<arraySize; ++j){
                array[j] = in.nextInt();
            }
            for(int j=arraySize-1; j>=0; --j){
                System.out.print(array[j]+" ");
            }
            System.out.println();
        }
    }
}
