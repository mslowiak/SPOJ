/*
    Marcin Słowiak
    rozwiązanie zadania nr. 969 - http://pl.spoj.com/problems/ROWNANIE/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        double a,b,c, d;
        while(in.hasNext()){
            a = in.nextDouble();
            b = in.nextDouble();
            c = in.nextDouble();
            d = b*b - 4*a*c;
            
            if(d == 0){
                System.out.println("1");
            }else if(d>0){
                System.out.println("2");
            }else{
                System.out.println("0");
            }
        }
    }
}

