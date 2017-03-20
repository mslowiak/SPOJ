/*
    Marcin Słowiak
    rozwiązanie zadania nr. 15917 - http://pl.spoj.com/problems/AL_10_01/
*/
    
import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int amountOfData = in.nextInt();
        for(int i=0; i<amountOfData; ++i){
            int length = in.nextInt();
            String text = in.next();
            int nines = 0;
            int tens = 0;
            if(text.charAt(0) == '?'){
                nines = 1;
            }
            for(int j=1; j<text.length(); ++j){
                if(text.charAt(j) == '?'){
                    tens++;
                }
            }
            if(length == 1 && nines == 1){
                System.out.print("10");
            }else{
                if(nines == 1){
                    System.out.print("9");
                }else{
                    System.out.print("1");
                }
                for(int j=0; j<tens; ++j){
                    System.out.print("0");
                }
            }

            System.out.println();
        }
    }
}
