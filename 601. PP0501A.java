/*
    Marcin Słowiak
    rozwiązanie zadania nr. 601 - http://pl.spoj.com/problems/PP0501A/
*/

import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static int NWD(int a, int b){
        while(b != 0){
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    public static void main(String[] args) {
        int amountOfData = in.nextInt();
        for(int i=0; i<amountOfData; ++i){
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(NWD(a,b));
        }
    }
}
