/*
    Marcin Słowiak
    rozwiązanie zadania nr. 568 - http://pl.spoj.com/problems/BFN1/
*/

import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static boolean isPalindrome(int number){
        String numberToString = number + "";
        int rightCheck = numberToString.length() - 1;
        for(int i=0; i<=rightCheck; ++i, --rightCheck){
            if(numberToString.charAt(i) != numberToString.charAt(rightCheck)){
                return false;
            }
        }
        return true;
    }

    public static int sumUp(int number){
        String numberToString = number + "";
        int sum = 0;
        int mult = 1;

        for(int i=0; i<numberToString.length(); ++i){
            sum = sum + (numberToString.charAt(i)-48) * mult;
            mult = mult * 10;
        }

        mult = 1;

        for(int i=numberToString.length() - 1; i>=0; --i){
            sum = sum + (numberToString.charAt(i)-48) * mult;
            mult = mult * 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int amountOfData = in.nextInt();
        for(int i=0; i<amountOfData; ++i){
            int amountOfSum = 0;
            int number = in.nextInt();
            while(!isPalindrome(number)){
                number = sumUp(number);
                amountOfSum++;
            }
            System.out.println(number + " " + amountOfSum);
        }
    }
}
