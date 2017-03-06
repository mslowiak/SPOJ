/*
    Marcin Słowiak
    rozwiązanie zadania nr. 1978 - http://pl.spoj.com/problems/PROGC01/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args){
        int amountOfLines = 0;
        while(in.hasNextLine()){
            in.nextLine();
            amountOfLines++;
        }
        System.out.println(amountOfLines);
    }
}
