/*
    Marcin Słowiak
    rozwiązanie zadania nr. 1102 - http://pl.spoj.com/problems/PP0604A/
*/


import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        int amountOfData = in.nextInt();

        for(int i=0; i<amountOfData; ++i){
            int amount = in.nextInt();
            double array[] = new double[amount];
            double sum = 0;

            for(int j=0; j<amount; ++j){
                array[j] = in.nextInt();
                sum += array[j];
            }

            double average = sum/amount;
            double min = Integer.MAX_VALUE;
            int numberMin = 0;

            for(int j=0; j<amount; ++j){
                double tmp = average - array[j];
                tmp = Math.abs(tmp);
                if(tmp < min){
                    min = tmp;
                    numberMin = (int) array[j];
                }
            }
            System.out.println(numberMin);
        }

    }
}