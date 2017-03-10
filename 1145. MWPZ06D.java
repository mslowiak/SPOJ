/*
    Marcin Słowiak
    rozwiązanie zadania nr. 1145 - http://pl.spoj.com/problems/MWPZ06D/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int amountOfData = in.nextInt();
        for(int i=0; i<amountOfData; ++i){
            int amountOfStudents = in.nextInt();
            int amountOfCandy = in.nextInt();
            if(amountOfStudents == 1){
                System.out.println("TAK");
            }
            else if(amountOfStudents-1 > amountOfCandy){
                System.out.println("TAK");
            }else{
                if(amountOfCandy % (amountOfStudents-1) != 0){
                    System.out.println("TAK");
                }else{
                    System.out.println("NIE");
                }
            }
        }
    }
}
