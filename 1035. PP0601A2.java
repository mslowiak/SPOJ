/*
    Marcin Słowiak
    rozwiązanie zadania nr. 1035 - http://pl.spoj.com/problems/PP0601A2/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        int counter = 0;
        int a = in.nextInt();
        System.out.println(a);
        while(counter!=3){
            int b = in.nextInt();
            if(a!= 42 && b==42){
                counter++;
            }
            System.out.println(b);
            a = b;
        }
    }
}