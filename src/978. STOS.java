/*
    Marcin Słowiak
    rozwiązanie zadania nr. 978 - http://pl.spoj.com/problems/STOS/
*/

import java.util.*;

class StackNew{
    int [] array;
    int counter;

    StackNew(){
        array = new int[10];
        counter = -1;
    }

    void push(int n){
        if(counter+1<10){
            array[++counter] = n;
            System.out.println(":)");
        }else{
            System.out.println(":(");
        }
    }

    void pop(){
        if(counter < 0){
            System.out.println(":(");
        }else{
            System.out.println(array[counter]);
            counter--;
        }
    }
}

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        List<Integer> array = new ArrayList<Integer>();
        char operation;
        StackNew stack = new StackNew();
        while(in.hasNext()){
            operation = in.next().charAt(0);
            if(operation == '+'){
                stack.push(in.nextInt());
            }else if(operation == '-'){
                stack.pop();
            }
        }

    }
}