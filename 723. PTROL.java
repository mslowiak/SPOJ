/*
    Marcin Słowiak
    rozwiązanie zadania nr. 723 - http://pl.spoj.com/problems/PTROL/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static int [] move(int [] array){
        int tmp = array[0];
        for(int i=0; i<array.length-1; ++i){
            array[i] = array[i+1];
        }
        array[array.length-1] = tmp;
        return array;
    }

    public static void main(String[] args){
        int amountOfData = in.nextInt();
        for(int i=0; i<amountOfData; ++i){
            int arrayLength = in.nextInt();
            int array[] = new int[arrayLength];
            for(int j=0; j<arrayLength; ++j){
                array[j] = in.nextInt();
            }
            array = move(array);
            for(int j=0; j<arrayLength; ++j){
                System.out.print(array[j]+" ");
            }
            System.out.println();
        }
    }
}