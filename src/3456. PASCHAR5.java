/*
    Marcin Słowiak
    rozwiązanie zadania nr. 3456 - http://pl.spoj.com/problems/PASCHAR5/
*/

import java.util.*;

class Cipher{
    String text;

    Cipher(String text){
        this.text = text;
    }

    String getText(){
        return text;
    }

    void encryptText(){
        String output = "";
        for(int i=0; i<text.length(); ++i){
            if(text.charAt(i)>='a' && text.charAt(i)<='z'){
                output = output + encryptSmall(text.charAt(i));
            }else if(text.charAt(i)>='A' && text.charAt(i)<='Z'){
                output = output + encryptLower(text.charAt(i));
            }else if(text.charAt(i)>='0' && text.charAt(i)<='9'){
                output = output + encryptNumber(text.charAt(i));
            }else{
                output = output + text.charAt(i);
            }
        }
        text = output;
    }

    Character encryptSmall(char x){
        if(x>='a' && x<='m'){
            x = (char)(x+13);
        }else{
            x = (char)(x-13);
        }
        return x;
    }

    Character encryptLower(char x){
        if(x>='A' && x<='M'){
            x = (char)(x+13);
        }else{
            x = (char)(x-13);
        }
        return x;
    }

    Character encryptNumber(char x){
        if(x>='0' && x<='4'){
            x = (char)(x+5);
        }else{
            x = (char)(x-5);
        }
        return x;
    }
}

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        while(in.hasNextLine()){
            Cipher c = new Cipher(in.nextLine());
            c.encryptText();
            System.out.println(c.getText());
        }
    }
}
