/*
    Marcin Słowiak
    rozwiązanie zadania nr. 1596 - http://pl.spoj.com/problems/WSEGA/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int amountOfData = in.nextInt();
        for(int i=0; i<amountOfData; ++i){
            int amountOfSegments = in.nextInt();
            int legs = 0;
            for(int j=0; j<amountOfSegments; ++j){
                legs = legs + in.nextInt();
            }
            System.out.println(amountOfSegments + legs - 1);
        }
    }
}
