/*
    Marcin Słowiak
    rozwiązanie zadania nr. 4647 - http://pl.spoj.com/problems/PTWPZ073/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static char convertToNumber(char c){
        char out = '0';
        if(c>='A' && c<='C'){
            out = '2';
        }else if(c>='D' && c<='F'){
            out = '3';
        }else if(c>='G' && c<='I'){
            out = '4';
        }else if(c>='J' && c<='L'){
            out = '5';
        }else if(c>='M' && c<='O'){
            out = '6';
        }else if(c>='P' && c<='S'){
            out = '7';
        }else if(c>='T' && c<='V'){
            out = '8';
        }else if(c>='W' && c<='Z'){
            out = '9';
        }
        return out;
    }

    public static void main(String[] args){
        int amountOfData = in.nextInt();
        in.nextLine();
        for(int i=0; i<amountOfData; ++i){
            String text = in.nextLine();
            String output = "";
            for(int j=0; j<text.length(); ++j){
                output = output + (char)convertToNumber(text.charAt(j));
            }
            System.out.println(output);
        }
    }
}

