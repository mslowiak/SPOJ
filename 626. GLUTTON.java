/*
    Marcin Słowiak
    rozwiązanie zadania nr. 626 - http://pl.spoj.com/problems/GLUTTON/
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int amountOfData = Integer.parseInt(in.readLine());
        int daySeconds = 86400;
        String tmp[];
        for(int i=0; i<amountOfData; ++i){
            int sum = 0;
            tmp = in.readLine().split(" ");
            int amountOfCookies = Integer.parseInt(tmp[0]);
            int amountInBox = Integer.parseInt(tmp[1]);
            for(int j=0; j<amountOfCookies; ++j){
                int time = Integer.parseInt(in.readLine());
                int totalAmountOfCookies = daySeconds / time;
                sum = sum + totalAmountOfCookies;
            }
            if(sum % amountInBox == 0){
                System.out.println(sum/amountInBox);
            }else{
                System.out.println(sum/amountInBox+1);
            }
        }
    }
}
