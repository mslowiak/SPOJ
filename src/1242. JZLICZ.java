/*
    Marcin Słowiak
    rozwiązanie zadania nr. 1242 - http://pl.spoj.com/problems/JZLICZ/
*/

import java.util.*;

class Counter{
    int [] array;
    int deleteCapitals = 39;
    int deleteSmalls = 97;
    int amountLetters = 52;

    Counter(){
        array = new int[amountLetters];
    }

    void countLetters(String lineOfText){
        int length = lineOfText.length();
        for(int i=0; i<length; ++i){
            if(lineOfText.charAt(i)>=65 && lineOfText.charAt(i)<=90){
                array[lineOfText.charAt(i)-deleteCapitals]++;
            }
            if(lineOfText.charAt(i)>=97 && lineOfText.charAt(i)<=122){
                array[lineOfText.charAt(i)-deleteSmalls]++;
            }
        }
    }

    void displayResults(){
        int halfAmountOfLetters = amountLetters / 2;
        for(int i=0; i<halfAmountOfLetters; ++i){
            if(array[i] != 0){
                System.out.println((char)(i + deleteSmalls) + " " + array[i]);
            }
        }
        for(int i=halfAmountOfLetters; i<amountLetters; ++i){
            if(array[i] != 0){
                System.out.println((char)(i + deleteCapitals) + " " + array[i]);
            }
        }
    }

}

public class Main {
    public static Scanner in = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args){
        Counter counterJob = new Counter();
        int amountOfData = in.nextInt();
        in.nextLine();
        for(int i=0; i<amountOfData; ++i){
            String lineOfText = in.nextLine();
            counterJob.countLetters(lineOfText);
        }
        counterJob.displayResults();
    }
}