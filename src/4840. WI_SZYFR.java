/*
    Marcin Słowiak
    rozwiązanie zadania nr. 4840 - http://pl.spoj.com/problems/WI_SZYFR/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static String encrypt(String text, String key){
        String output = "";
        for(int i=0; i<text.length(); ++i){
            int num = text.charAt(i);
            int move = key.charAt(i%key.length())-48;
            if(num >= 65 && num <= 90) {
                if (num + move > 90) {
                    num = num + move - 26;
                    output = output + (char) num;
                } else {
                    output = output + (char) (num + move);
                }
            }
        }
        return output;
    }

    public static String decipher(String text, String key){
        String output = "";
        for(int i=0; i<text.length(); ++i){
            int num = text.charAt(i);
            int move = key.charAt(i%key.length())-48;
            if(num >= 65 && num <= 90){
                if(num-move < 65){
                    num = num - move + 26;
                    output = output + (char)num;
                }else{
                    output = output + (char)(num-move);
                }    
            }
        }
        return output;
    }

    public static void main(String[] args){

        String command = in.nextLine();
        int keyInt = in.nextInt();
        in.nextLine();
        String key = "" + keyInt;
        String text = in.nextLine();
        if(command.equals("SZYFRUJ")){
            System.out.println(encrypt(text, key));
        }else if(command.equals("DESZYFRUJ")){
            System.out.println(decipher(text, key));
        }

    }
}
