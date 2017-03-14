/*
    Marcin Słowiak
    rozwiązanie zadania nr. 1854 - http://pl.spoj.com/problems/CHAOS/
*/
    
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static int [] addMinute(int [] time){
        if(time[1] == 59){
            time[1] = 0;
            if(time[0] == 23){
                time[0] = 0;
            }else{
                time[0]++;
            }
        }else{
            time[1]++;
        }
        return time;
    }

    public static boolean check(int [] time){
        String c = "";
        if(time[0] == 0){
            if(time[1]>=1 && time[1]<=9){
                return true;
            }
            c = "" + time[1];
            return checkString(c);
        }else{
            if(time[1]>=1 && time[1]<=9){
                c = time[0] + "0" + time[1];
                return checkString(c);
            }
            c = "" + time[0] + time[1];
            return checkString(c);
        }
    }

    public static boolean checkString(String t){
        for(int i=0; i<t.length()-i; ++i){
            if(t.charAt(i) != t.charAt(t.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void display(int [] time){
        String x = "";
        if(time[0]>=0 && time[0]<=9){
            x = "0" + time[0]+":";
        }else{
            x = time[0] + ":";
        }
        if(time[1]>=0 && time[1]<=9){
            x = x + "0" + time[1];
        }else{
            x = x + time[1];
        }
        System.out.println(x);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int amountOfData = Integer.parseInt(in.readLine());
        for(int i=0; i<amountOfData; ++i){
            String [] text = in.readLine().split(":");
            int [] time = new int[2];

            time[0] = Integer.parseInt(text[0]);
            time[1] = Integer.parseInt(text[1]);

            time = addMinute(time);
            while(!check(time)){
                time = addMinute(time);
            }

            display(time);
        }
    }
}
