/*
    Marcin Słowiak
    rozwiązanie zadania nr. 1055 - http://pl.spoj.com/problems/PP0602A/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        int amountOfData = in.nextInt();
        for(int i=0; i<amountOfData; ++i){
            int a = in.nextInt();
            int numbers[] = new int[a];
            for(int j=0; j<a; ++j){
                int b = in.nextInt();
                numbers[j] = b;
            }
            for(int j=1; j<a; j=j+2){
                System.out.print(numbers[j] + " ");
            }
            for(int j=0; j<a; j=j+2){
                System.out.print(numbers[j] + " ");
            }
            System.out.println();
        }
    }
}