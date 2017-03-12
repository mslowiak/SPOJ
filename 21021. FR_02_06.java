/*
    Marcin Słowiak
    rozwiązanie zadania nr. 21021 - http://pl.spoj.com/problems/FR_02_06/
*/
    
import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String x1 = in.nextLine();
        String x2 = in.nextLine();
        String x3 = in.nextLine();
        int result = 0;
        for(int i=0; i<x1.length(); ++i){
            char ch1 = x1.charAt(i);
            char ch2 = x2.charAt(i);
            char ch3 = x3.charAt(i);
            if(ch1 != ch2 && ch2 == ch3){
                result = result + 2;
            }else if(ch1 != ch2 && ch1 == ch3){
                result++;
            }else if(ch1 != ch3 && ch1 == ch2){
                result++;
            }else if(ch1 != ch2 && ch1 != ch3){
                result++;
            }
        }
        System.out.println(result);
    }
}
