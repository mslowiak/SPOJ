/*
    Marcin Słowiak
    rozwiązanie zadania nr. 1240 - http://pl.spoj.com/problems/JWSPLIN/
*/


import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args){
        int amountOfData = in.nextInt();
        for(int i=0; i<amountOfData; ++i){
            int x [] = new int[3];
            int y [] = new int[3];
            x[0] = in.nextInt();
            y[0] = in.nextInt();
            x[1] = in.nextInt();
            y[1] = in.nextInt();
            x[2] = in.nextInt();
            y[2] = in.nextInt();
            int det = x[0]*y[1]+y[0]*x[2]+x[1]*y[2]-x[1]*y[0]-x[0]*y[2]-x[2]*y[1];
            if(det == 0){
                System.out.println("TAK");
            }else{
                System.out.println("NIE");
            }
        }
    }
}