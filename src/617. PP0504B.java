/*
    Marcin Słowiak
    rozwiązanie zadania nr. 617 - http://pl.spoj.com/problems/PP0504B/
*/

import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static String stringMerge(String a, String b){
        String output="";
        int amountOfChars;
        if(a.length()<b.length()){
            amountOfChars = a.length();
        }else{
            amountOfChars = b.length();
        }
        for(int i=0; i<amountOfChars; ++i){
            output = output + a.charAt(i) + b.charAt(i);
        }
        return output;
    }

    public static void main(String[] args) {
        int amountOfData = in.nextInt();
        for(int i=0; i<amountOfData; ++i){
            String word1 = in.next();
            String word2 = in.next();
            System.out.println(stringMerge(word1, word2));
        }
    }
}
