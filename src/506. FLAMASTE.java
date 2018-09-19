/*
    Marcin Słowiak
    rozwiązanie zadania nr. 506- http://pl.spoj.com/problems/FLAMASTE/
*/

import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int amountOfData = in.nextInt();
        in.nextLine();
        for(int i=0; i<amountOfData; ++i){
            String tmpText = in.nextLine();
            int textLength = tmpText.length();
            for(int j=0; j<textLength; ++j){
                System.out.print(tmpText.charAt(j));
                if(j+1<textLength && tmpText.charAt(j) == tmpText.charAt(j+1)){
                    int ile = 1;
                    int k = j+1;
                    while(k<textLength && tmpText.charAt(j) == tmpText.charAt(k)){
                        ile++;
                        k++;
                    }
                    if(ile>2){
                        j = k-1;
                        System.out.print(ile);
                    }
                }
            }
            System.out.println();
        }
    }
}
