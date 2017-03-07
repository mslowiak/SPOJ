/*
    Marcin Słowiak
    rozwiązanie zadania nr. 4138 - http://pl.spoj.com/problems/DOUGHNUT/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        int amountOfData = in.nextInt();
        for(int i=0; i<amountOfData; ++i){
            int cats = in.nextInt();
            int backpackSpace = in.nextInt();
            int doughnutWeight = in.nextInt();
            if(cats * doughnutWeight <= backpackSpace){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}

