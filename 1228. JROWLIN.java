/*
    Marcin Słowiak
    rozwiązanie zadania nr. 1228 - http://pl.spoj.com/problems/JROWLIN/
*/


import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args){
        double a, b, c;
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if(a == 0){
            if(c-b == 0){
                System.out.println("NWR");
            }else{
                System.out.println("BR");
            }
        }else{
            System.out.printf("%3.2f", (c-b)/a);
        }
    }
}