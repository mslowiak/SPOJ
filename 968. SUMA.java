/*
    Marcin Słowiak
    rozwiązanie zadania nr. 968 - http://pl.spoj.com/problems/SUMA/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        int suma = 0;
        while(in.hasNext()){
            suma = suma + in.nextInt();
            System.out.println(suma);
        }
    }
}
