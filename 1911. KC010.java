/*
    Marcin Słowiak
    rozwiązanie zadania nr. 1911 - http://pl.spoj.com/problems/KC010/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static boolean isNumber(char x){
        if(x>='0' && x<='9'){
            return true;
        }
        return false;
    }

    public static boolean isLetter(char x){
        if(x>='a' && x<='z'){
            return true;
        }
        if(x>='A' && x<='Z'){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        while(in.hasNextLine()){
            int letters = 0;
            int numbers = 0;
            String lane = in.nextLine();
            String [] words = lane.split(" ");
            for(int i=0; i<words.length; ++i){
                if(isLetter(words[i].charAt(words[i].length()-1))){
                    letters++;
                }else if(isNumber(words[i].charAt(words[i].length()-1))){
                    numbers++;
                }
            }
            System.out.println(numbers + " " + letters);
        }
    }
}
