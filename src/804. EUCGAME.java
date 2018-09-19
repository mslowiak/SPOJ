/*
    Marcin Słowiak
    rozwiązanie zadania nr. 804 - http://pl.spoj.com/problems/EUCGAME/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        int amountOfData = in.nextInt();
        for(int i=0; i<amountOfData; ++i){
            int player1 = in.nextInt();
            int player2 = in.nextInt();
            while (player1 != player2){
                if(player1 > player2){
                    player1 -= player2;
                }else{
                    player2 -= player1;
                }
            }
            System.out.println(player1+player2);
        }
    }
}