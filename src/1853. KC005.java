/*
    Marcin Słowiak
    rozwiązanie zadania nr. 1853 - http://pl.spoj.com/problems/KC005/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static boolean isNameCorrect(String text){

        if(text.length()>0){
            if(text.charAt(0)>='A' && text.charAt(0)<='Z'){
                for(int i=1; i<text.length(); ++i){
                    if(text.charAt(i)<'a' || text.charAt(0)>'z'){
                        return false;
                    }
                }
                return true;
            }
        }


        return false;
    }

    public static boolean isDateCorrect(String text){
        String yearText = text.substring(0,4);
        String monthText = text.substring(5,7);
        String dayText = text.substring(8,10);

        int year = 0, month = 0, day = 0;

        if(!isNumber(yearText)){
            return false;
        }
        if(!isNumber(monthText)){
            return false;
        }
        if(!isNumber(dayText)){
            return false;
        }

        year = Integer.parseInt(yearText);
        month = Integer.parseInt(monthText);
        day = Integer.parseInt(dayText);

        if(checkNumber(year, 1900, 2000)){
            if(checkNumber(month, 1, 12)){
                if(checkNumber(day, 1, 31)){
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isNumber(String text){
        for(int i=0; i<text.length(); ++i){
            if(text.charAt(i)<'0' || text.charAt(i)>'9'){
                return false;
            }
        }
        return true;
    }

    public static boolean checkNumber(int number, int rangeFrom, int rangeTo){
        if(number>=rangeFrom && number<=rangeTo){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        while(in.hasNextLine()){
            String laneOfText = in.nextLine();
            String [] array = laneOfText.split("; ");
            array[0] = array[0].substring(6);
            array[1] = array[1].substring(10);
            array[2] = array[2].substring(10);
            if(!isNameCorrect(array[0])){
                System.out.println("0");
            }else{
                if(!isNameCorrect(array[1])){
                    System.out.println("1");
                }else{
                    if(!isDateCorrect(array[2])){
                        System.out.println("2");
                    }else{
                        System.out.println("3");
                    }
                }
            }
        }
    }
}