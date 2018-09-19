/*
    Marcin Słowiak
    rozwiązanie zadania nr. 522 - http://pl.spoj.com/problems/PRZEDSZK/
*/

import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static int NWD(int a, int b){
        int tmp;
        while(b != 0){
            tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
    
    public static int NWW(int a, int b){
        return a*b/NWD(a, b);
    }
    
    public static void main(String[] args) {
        int amountOfData = in.nextInt();
        for(int i=0; i<amountOfData; ++i){
            int groupOfChildren1 = in.nextInt();
            int groupOfChildren2 = in.nextInt();
            System.out.println(NWW(groupOfChildren1, groupOfChildren2));
        }
    }
}