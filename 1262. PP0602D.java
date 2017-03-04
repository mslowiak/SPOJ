/*
    Marcin Słowiak
    rozwiązanie zadania nr. 1262 - http://pl.spoj.com/problems/PP0602D/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        int n = in.nextInt();
        int k = in.nextInt();

        int array [] = new int[n];

        for(int i=0; i<n; ++i){
            array[i] = in.nextInt();
        }

        for(int i=0; i<k; ++i){
            int tmp = array[0];
            for(int j=0; j+1<n; ++j){
                array[j] = array[j+1];
            }
            array[n-1] = tmp;
        }

        for(int i=0; i<n; ++i){
            System.out.print(array[i]+" ");
        }
    }
}