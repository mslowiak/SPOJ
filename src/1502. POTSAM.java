/*
    Marcin Słowiak
    rozwiązanie zadania nr. 1502 - http://pl.spoj.com/problems/POTSAM/
*/
    
import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        int n1, k1, n2, k2;
        n1 = in.nextInt();
        k1 = in.nextInt();
        n2 = in.nextInt();
        k2 = in.nextInt();
        System.out.println(n1*k1+n2*k2);
    }
}