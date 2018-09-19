/*
    Marcin Słowiak
    rozwiązanie zadania nr. 977 - http://pl.spoj.com/problems/TABLICA/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        List<Integer> array = new ArrayList<Integer>();
        while(in.hasNext()){
            array.add(in.nextInt());
        }
        
        for(int i=array.size()-1; i>=0; --i){
            System.out.println(array.get(i));
        }
    }
}