/*
    Marcin Słowiak
    rozwiązanie zadania nr. 3326 - http://pl.spoj.com/problems/PASTAB2/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        int amountOfData = in.nextInt();
        int [] array = new int[amountOfData];
        for(int i=0; i<amountOfData; ++i){
            array[i] = in.nextInt();
        }
        char ch = in.next().charAt(0);
        int value = in.nextInt();
        if(ch == '>'){
            for(int i=0; i<amountOfData; ++i){
                if(array[i] > value){
                    System.out.println(array[i]);
                }
            }
        }else if(ch == '<'){
            for(int i=0; i<amountOfData; ++i){
                if(array[i] < value){
                    System.out.println(array[i]);
                }
            }
        }
    }
}
