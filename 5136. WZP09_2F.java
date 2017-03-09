/*
    Marcin Słowiak
    *rozwiązanie zadania nr. 5136 - http://pl.spoj.com/problems/WZP09_2F/
*/

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void convertTime(int hour, int minutes){
        String output = "";
        if(hour < 10){
            output = output + ",0" + hour + ":";
        }else if (hour == 0){
            output = output + ",00" + ":";
        }else{
            output = output + "," + hour + ":";
        }

        if(minutes < 10){
            output = output + "0" + minutes;
        }else if (minutes == 0){
            output = output + "00";
        }else{
            output = output + minutes;
        }
        System.out.print(output);
    }

    public static int[] addTime(int hour, int minutes, int add){
        if(minutes+add >= 60){
            if(hour+(minutes+add)/60 >= 24){
                hour = (hour + (minutes+add)/60) % 24;
            }else{
                hour = hour + (minutes+add)/60;
            }
            minutes = (minutes + add) % 60;
        }else{
            minutes = minutes + add;
        }
        int [] array = new int[2];

        array[0] = hour;
        array[1] = minutes;

        return array;
    }

    public static void main(String[] args){
        String time = in.nextLine();
        List<Integer> breaks = new ArrayList<Integer>();
        while(in.hasNext()){
            breaks.add(in.nextInt());
        }
        int [] out = new int[2];
        out[0] = Integer.parseInt(time.substring(0,2));
        out[1] = Integer.parseInt(time.substring(3));

        System.out.print(time);
        for(int i=0; i<breaks.size(); ++i){

            out = addTime(out[0], out[1], 45);
            convertTime(out[0], out[1]);

            out = addTime(out[0], out[1], breaks.get(i));
            convertTime(out[0], out[1]);
        }
        out = addTime(out[0], out[1], 45);
        convertTime(out[0], out[1]);
    }
}
