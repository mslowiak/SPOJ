/*
    Marcin Słowiak
    rozwiązanie zadania nr. 2181 - http://pl.spoj.com/problems/PROGC05/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        while(in.hasNextLine()){
            String [] text = in.nextLine().split(" ");
            char ch = text[0].charAt(0);
            for(int i=0; i<text[1].length(); ++i){
                if(text[1].charAt(i) != ch){
                    System.out.print(text[1].charAt(i));
                }
            }
            System.out.println();
        }
    }
}
