/*
    Marcin Słowiak
    rozwiązanie zadania nr. 609 - http://pl.spoj.com/problems/ETI06F1/
*/

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double r = in.nextDouble();
        double d = in.nextDouble();
        double P = (r*r-d*d/4)*Math.PI;
        System.out.format("%.2f%n", P);
    }
}
