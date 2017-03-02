/*
    Marcin Słowiak
    rozwiązanie zadania nr. 997 - http://pl.spoj.com/problems/CALC/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static int count(char operation, int a, int b){
        int out = 0;
        if(operation == '+'){
            out = a+b;
        }else if(operation == '-'){
            out = a-b;
        }else if(operation == '*'){
            out = a*b;
        }else if(operation == '/'){
            out = a/b;
        }else if(operation == '%'){
            out = a%b;
        }
        return out;
    }

    public static void main(String[] args){
        char operation;
        int a, b;
        while(in.hasNext()){
            operation = in.next().charAt(0);
            a = in.nextInt();
            b = in.nextInt();
            System.out.println(count(operation, a, b));
        }
    }
}