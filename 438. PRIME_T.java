/*
    Marcin Słowiak
    rozwiązanie zadania nr. 438- http://pl.spoj.com/problems/PRIME_T/
*/

import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);


    public static boolean isPrimary(int num){
        if(num<2){
            return false;
        }


        for(int i=2; i*i<=num; ++i){
            if(num % i == 0){
                return false;
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        int amountOfData = in.nextInt();
        for(int i=0; i<amountOfData; ++i){
            int number = in.nextInt();
            if(isPrimary(number)){
                System.out.println("TAK");
            }else{
                System.out.println("NIE");
            }
        }
    }
}
