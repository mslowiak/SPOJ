/*
    Marcin Słowiak
    rozwiązanie zadania nr. 496 - http://pl.spoj.com/problems/FCTRL3/
*/

import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void printAnswer(long num){
        if (num<=1){
            System.out.println("0 1");
        }
        else if(num == 2){
            System.out.println("0 2");
        }
        else if(num == 3){
            System.out.println("0 6");
        }
        else if(num == 4){
            System.out.println("2 4");
        }
        else if(num == 5 || num == 6 || num == 8){
            System.out.println("2 0");
        }
        else if(num == 7){
            System.out.println("4 0");
        }
        else if(num == 9){
            System.out.println("8 0");
        }
        else{
            System.out.println("0 0");
        }
    }

    public static void main(String[] args) {
        int amountOfData = in.nextInt();
        for(int i=0; i<amountOfData; ++i){
            long number = in.nextLong();
            printAnswer(number);
        }
    }
}
