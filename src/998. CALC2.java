/*
    Marcin Słowiak
    rozwiązanie zadania nr. 998 - http://pl.spoj.com/problems/CALC2/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static int count(int [] array, char operation, int adress1, int adress2){
        int out = 0;
        if(operation == '+'){
            out = array[adress1]+array[adress2];
        }else if(operation == '-'){
            out = array[adress1]-array[adress2];
        }else if(operation == '*'){
            out = array[adress1]*array[adress2];
        }else if(operation == '/'){
            out = array[adress1]/array[adress2];
        }else if(operation == '%'){
            out = array[adress1]%array[adress2];
        }
        return out;
    }

    public static void main(String[] args){
        int [] array = new int[10];
        char operation;
        int adress, value;
        while(in.hasNext()){
            operation = in.next().charAt(0);
            adress = in.nextInt();
            value = in.nextInt();
            if(operation != 'z'){
                System.out.println(count(array, operation, adress, value));
                break;
            }
            array[adress] = value;
        }
        while(in.hasNext()){
            operation = in.next().charAt(0);
            adress = in.nextInt();
            value = in.nextInt();
            System.out.println(count(array, operation, adress, value));
        }
    }
}