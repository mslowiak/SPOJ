/*
    Marcin Słowiak
    rozwiązanie zadania nr. 1011 - http://pl.spoj.com/problems/POL/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        int amountOfData = in.nextInt();
        in.nextLine();
        for(int i=0; i<amountOfData; ++i){
            String text = in.nextLine();
            System.out.println(text.substring(0, text.length()/2));
        }
    }
}