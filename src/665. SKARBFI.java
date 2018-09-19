/*
    Marcin Słowiak
    rozwiązanie zadania nr. 675 - http://pl.spoj.com/problems/SKARBFI/
*/

import java.util.*;


public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void printWay(int x, int y, int xp, int yp){
        int sx, sy;
        if((x == xp)&& (y == yp)){
            System.out.println("studnia");
        }else{
            sx = x - xp;
            sy = y - yp;
            if(sx > 0){
                System.out.println("1 "+sx);
            }else if(sx < 0){
                System.out.println("0 "+(-sx));
            }
            if(sy > 0){
                System.out.println("2 "+sy);
            }else if(sy < 0){
                System.out.println("3 "+(-sy));
            }
        }
    }

    public static int [] locateTreasure(int x, int y){
        int amountOfClues = in.nextInt();
        for(int i=0; i<amountOfClues; ++i){
            int direction = in.nextInt();
            int amountOfSteps = in.nextInt();
            if(direction == 0){
                x = x + amountOfSteps;
            }else if(direction == 1){
                x = x - amountOfSteps;
            }else if(direction == 2){
                y = y - amountOfSteps;
            }else if(direction == 3){
                y = y + amountOfSteps;
            }
        }
        int [] tab = new int[2];
        tab[0] = x;
        tab[1] = y;
        return tab;
    }

    public static void main(String[] args){
        int amountOfData = in.nextInt();
        for(int i=0; i<amountOfData; ++i){
            int [] xy = new int[2];
            xy[0] = 0;
            xy[1] = 0;
            int xp=0, yp=0;
            xy = locateTreasure(xy[0],xy[1]);
            printWay(xp,yp,xy[0],xy[1]);
        }
    }
}
*