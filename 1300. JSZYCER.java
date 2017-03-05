/*
    Marcin Słowiak
    rozwiązanie zadania nr. 1300 - http://pl.spoj.com/problems/JSZYCER/
*/


import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        while(in.hasNextLine()){
            String text = in.nextLine();
            String output = "";
            int textLength = text.length();
            for(int i=0; i<textLength; ++i){
                if(text.charAt(i) >= 65 && text.charAt(i) <= 87){
                    output = output + (char)(text.charAt(i)+3);
                }else if(text.charAt(i) == 88){
                    output = output + (char)65;
                }else if(text.charAt(i) == 89){
                    output = output + (char)66;
                }else if(text.charAt(i) == 90){
                    output = output + (char)67;
                }else{
                    output = output + text.charAt(i);
                }
            }
            System.out.println(output);
        }
    }
}