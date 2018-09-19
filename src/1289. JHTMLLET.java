/*
    Marcin Słowiak
    rozwiązanie zadania nr. 1289 - http://pl.spoj.com/problems/JHTMLLET/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static String convertSentence(String input){
        int stringLength = input.length();
        String out ="";
        for(int i=0; i<stringLength; ++i){
            if(input.charAt(i) == '<'){
                out = out + input.charAt(i);
                i++;
                while(input.charAt(i) != '>'){
                    if(input.charAt(i) >='a' && input.charAt(i) <= 'z'){
                        out = out + (char)(input.charAt(i) - 32 );
                    }else{
                        out = out + input.charAt(i);
                    }
                    i++;
                }
                i--;
            }
            else{
                out = out + input.charAt(i);
            }
        }
        return out;
    }

    public static void main(String[] args){
        while(in.hasNextLine()){
            String data = in.nextLine();
            System.out.println(convertSentence(data));
        }
    }
}