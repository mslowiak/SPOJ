/*
    Marcin Słowiak
    rozwiązanie zadania nr. 27236 - http://pl.spoj.com/problems/AL_28_01/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int number = in.nextInt();
        in.nextLine();
        String text = in.nextLine();
        int dots = number/2;
        for(int i=0; i<number/2+1; ++i){
            for(int j=0; j<dots; ++j){
                System.out.print(".");
            }
            for(int j=dots; j<number-dots; ++j){
                System.out.print(text.charAt(j));
            }
            for(int j=number-dots; j<number; ++j){
                System.out.print(".");
            }
            dots--;
            System.out.println();
        }
    }
}
