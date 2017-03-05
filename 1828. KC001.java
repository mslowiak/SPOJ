/*
    Marcin Słowiak
    rozwiązanie zadania nr. 1828 - http://pl.spoj.com/problems/KC001/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        int sum = 0;
        for(int i=0; i<3; ++i){
            sum = sum + in.nextInt();
        }
        System.out.println(sum);
    }
}