/*
    Marcin Słowiak
    *rozwiązanie zadania nr. 5136 - http://pl.spoj.com/problems/WZP09_2F/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static boolean divideFive(String n){
        if(n.length()>1) {
            if (n.charAt(n.length() - 1) == '0' || n.charAt(n.length() - 1) == '5') {
                return true;
            }
        }
        return false;
    }

    public static boolean divideThree(String n){
        int sum = 0;
        for(int i=0; i<n.length(); ++i){
            sum = sum + (n.charAt(i)-48);
        }
        if(sum % 3 == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        String n = in.nextLine();
        while(!n.equals("0")){
            if(divideFive(n) && divideThree(n)){
                System.out.println("TAK");
            }else{
                System.out.println("NIE");
            }
            n = in.nextLine();
        }
    }
}
