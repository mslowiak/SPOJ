/*
    Marcin Słowiak
    rozwiązanie zadania nr. 1830 - http://pl.spoj.com/problems/KC003/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        double a, b, c, cMax;
        while(in.hasNextDouble()){
            a = in.nextDouble();
            b = in.nextDouble();
            c = in.nextDouble();
            if((a+b>c) && (c+b>a) && (a+c>b)){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }
    }
}