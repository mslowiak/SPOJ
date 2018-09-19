/*
    Marcin Słowiak
    rozwiązanie zadania nr. 1941 - http://pl.spoj.com/problems/KC015/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static boolean equal(String x, String y){
        for(int i=x.length()-1; i>=0; --i){
            if(x.charAt(i) != y.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static boolean equalOrLess(String x, String y){ // <=
        for(int i=x.length()-1; i>=0; --i){
            if(x.charAt(i) > y.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static boolean equalOrGreater(String x, String y){ // >=
        for(int i=x.length()-1; i>=0; --i){
            if(x.charAt(i) < y.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        while(in.hasNextLine()){
            String [] text = in.nextLine().split(" ");
            int size1 = text[0].length();
            int size2 = text[2].length();
            if(text[1].equals("==")){
                if(size1 == size2){
                    if(equal(text[0], text[2])){
                        System.out.println("1");
                    }else{
                        System.out.println("0");
                    }
                }else{
                    System.out.println("0");
                }
            }else if(text[1].equals("!=")){
                if(size1 == size2){
                    if(!equal(text[0], text[2])){
                        System.out.println("1");
                    }else{
                        System.out.println("0");
                    }
                }else{
                    System.out.println("1");
                }
            }else if(text[1].equals("<=")){
                if(size1>size2){
                    System.out.println("0");
                }else if(size1<size2){
                    System.out.println("1");
                }else{
                    if(equalOrLess(text[0], text[2])){
                        System.out.println("1");
                    }else{
                        System.out.println("0");
                    }
                }
            }else if(text[1].equals(">=")){
                if(size1<size2){
                    System.out.println("0");
                }else if(size1>size2){
                    System.out.println("1");
                }else{
                    if(equalOrGreater(text[0], text[2])){
                        System.out.println("1");
                    }else{
                        System.out.println("0");
                    }
                }
            }
        }
    }
}
