/*
    Marcin Słowiak
    rozwiązanie zadania nr. 21021 - http://pl.spoj.com/problems/FR_02_06/
*/
    
import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int amountOfData = in.nextInt();
        List<String> okey = new ArrayList<>();
        List<String> niedowaga = new ArrayList<>();
        List<String> nadwaga = new ArrayList<>();
        for(int i=0; i<amountOfData; ++i){
            String name = in.next();
            double weight = in.nextDouble();
            double height = in.nextDouble();
            height = height/100;
            double bmi = weight/(height*height);
            if(bmi >= 25){
                nadwaga.add(name);
            }else if(bmi > 18.5){
                okey.add(name);
            }else{
                niedowaga.add(name);
            }
        }

        System.out.println("niedowaga");
        for(String x : niedowaga){
            System.out.println(x);
        }
        System.out.println("");

        System.out.println("wartosc prawidlowa");
        for(String x : okey){
            System.out.println(x);
        }
        System.out.println("");

        System.out.println("nadwaga");
        for(String x : nadwaga){
            System.out.println(x);
        }
    }
}
