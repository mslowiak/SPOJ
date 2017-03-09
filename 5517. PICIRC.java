/*
    Marcin Słowiak
    rozwiązanie zadania nr. 5517 - http://pl.spoj.com/problems/PICIRC/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        int x = in.nextInt();
        int y = in.nextInt();
        int r = in.nextInt();
        int amounfOfData = in.nextInt();
        for(int i=0; i<amounfOfData; ++i){
            int a = in.nextInt();
            int b = in.nextInt();
            double range = (double)Math.sqrt((x-a)*(x-a) + (y-b)*(y-b));
            if(range < r){
                System.out.println("I");
            }else if(range > r){
                System.out.println("O");
            }else{
                System.out.println("E");
            }
        }
    }
}
