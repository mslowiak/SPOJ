/*
    Marcin Słowiak
    rozwiązanie zadania nr. 1261 - http://pl.spoj.com/problems/JPESEL/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        String pesel;
        int amountOfData = in.nextInt();
        in.nextLine();
        int array[] = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3, 1};
        for(int i=0; i<amountOfData; ++i){
            int s=0;
            pesel = in.nextLine();

            for(int j=0; j<11; ++j){
                int a = pesel.charAt(j)-48;
                s = s + a*array[j];
            }
            if(s%10 == 0){
                System.out.println("D");
            }else{
                System.out.println("N");
            }
        }
    }
}