/*
    Marcin Słowiak
    rozwiązanie zadania nr. 499 - http://pl.spoj.com/problems/PA05_POT/
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int amountOfData = in.nextInt();
        for(int i=0; i<amountOfData; ++i){

            int a = in.nextInt();
            int b = in.nextInt();
            List<Integer> dane = new ArrayList<Integer>();
            a = a % 10;
            int tmp = a;
            int mod = 0;
            boolean check = false;

            for(int j=0; j<b; ++j){
                tmp = tmp * a;
                mod = tmp % 10;
                check = false;
                for(int k=0; k<dane.size(); ++k){
                    if(dane.get(k) == mod){
                        check = true;
                    }
                }
                if(!check){
                    dane.add(mod);
                }else{
                    break;
                }
            }

            if(b == 0){
                System.out.println("1");
            }else if(b == 1){
                System.out.println(a);
            }else{
                System.out.println(dane.get((b-2)%dane.size()));
            }
        }
    }
}
