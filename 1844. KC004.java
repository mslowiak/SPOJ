/*
    Marcin Słowiak
    rozwiązanie zadania nr. 1844 - http://pl.spoj.com/problems/KC004/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        while(in.hasNextInt()){
            int occurrence = 0;
            int numberToSearch = in.nextInt();
            int amountOfNumbers = in.nextInt();
            for(int i=0; i<amountOfNumbers; ++i){
                if( numberToSearch == in.nextInt()){
                    occurrence++;
                }
            }
            System.out.println(occurrence);
        }
    }
}