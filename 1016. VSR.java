/*
    Marcin Słowiak
    rozwiązanie zadania nr. 1016 - http://pl.spoj.com/problems/VSR/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static int average(int v1, int v2){
        return 2*v1*v2/(v1+v2);
    }

    public static void main(String[] args){
        int amountOfData = in.nextInt();
        for(int i=0; i<amountOfData; ++i){
            int v1 = in.nextInt();
            int v2 = in.nextInt();
            System.out.println(average(v1,v2));
        }
    }
}