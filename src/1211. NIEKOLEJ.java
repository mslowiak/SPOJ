/*
    Marcin Słowiak
    rozwiązanie zadania nr. 1211 - http://pl.spoj.com/problems/NIEKOLEJ/
*/


import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int data = in.nextInt();
        if(data == 1 || data == 2){
            System.out.println("NIE");
        }else if(data == 3){
            System.out.println("1 3 0 2");
        }else{
            for(int i=0; i<=data; i=i+2){
                System.out.print(i+" ");
            }
            for(int i=1; i<=data; i=i+2){
                System.out.print(i+" ");
            }
        }
    }
}
