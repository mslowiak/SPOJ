/*
    Marcin Słowiak
    rozwiązanie zadania nr. 663 - http://pl.spoj.com/problems/PP0506A/
*/

import java.util.*;

class Point{
    String name;
    int x;
    int y;
    double length;

    Point(){};
    Point(String name, int x, int y){
        this.name = name;
        this.x = x;
        this.y = y;
        this.length = x*x + y*y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void display(){
        System.out.println(name+" "+x+" "+y);
    }
}

class comparePoints implements Comparator<Point>{
    @Override
    public int compare(Point o1, Point o2) {
        if(o1.length>o2.length){
            return 1;
        }
        else{
            return -1;
        }

    }
}

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        int amountOfData = in.nextInt();
        for(int i=0; i<amountOfData; ++i){
            int amountOfPoints = in.nextInt();
            List<Point> points = new ArrayList<Point>();
            for(int j=0; j<amountOfPoints; ++j){
                String name = in.next();
                int xPoint = in.nextInt();
                int yPoint = in.nextInt();
                points.add(new Point(name, xPoint, yPoint));
            }
            if(amountOfPoints>1){
                Collections.sort(points,new comparePoints());
            }
            for(int j=0; j<amountOfPoints; ++j){
                points.get(j).display();
            }
            System.out.println();
        }
    }
}
