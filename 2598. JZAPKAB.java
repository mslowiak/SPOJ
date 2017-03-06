/*
    Marcin Słowiak
    rozwiązanie zadania nr. 2598 - http://pl.spoj.com/problems/JZAPKAB/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        int [] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 10, 20, 30, 40, 50, 60, 70, 80, 90 ,100, 0, 200, 0, 300, 400, 500};
        while(in.hasNext()){
            String text = in.next();
            int sum = 0;
            for(int i=0; i<text.length(); ++i){
                sum = sum + values[(int)(text.charAt(i)-97)];
            }
            System.out.println(sum);
        }
    }
}
