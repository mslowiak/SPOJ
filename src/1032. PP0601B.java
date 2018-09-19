/*
    Marcin Słowiak
    rozwiązanie zadania nr. 1032 - http://pl.spoj.com/problems/PP0601B/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static boolean divide(int x, int y){
        int g = x / y;
        if(g*y == x){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        int amountOfData = in.nextInt();
        for(int i=0; i<amountOfData; ++i){
            int n = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            for(int j=0; j<n; ++j){
                if(divide(j,x) && !divide(j,y)){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}