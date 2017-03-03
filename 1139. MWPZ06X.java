/*
    Marcin Słowiak
    rozwiązanie zadania nr. 1139 - http://pl.spoj.com/problems/MWPZ06X/
*/


import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        int amountOfData = in.nextInt();
        for(int i=0; i<amountOfData; ++i){
            int a = in.nextInt();
            System.out.println(a*a);
        }
    }
}