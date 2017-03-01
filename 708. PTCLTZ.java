/*
    Marcin Słowiak
    rozwiązanie zadania nr. 708 - http://pl.spoj.com/problems/PTCLTZ/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);
    
    public static int collatz(int n){
        if(n % 2 == 0){
            return n/2;
        }else{
            return 3*n +1;
        }
    }
    
    public static void main(String[] args){
        int amountOfData = in.nextInt();
        for(int i=0; i<amountOfData; ++i){
            int count = 0;
            int n = in.nextInt();
            while(n != 1){
                n = collatz(n);
                count++;
            }
            System.out.println(count);
        }
    }
}
