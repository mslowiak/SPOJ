/*
    Marcin Słowiak
    rozwiązanie zadania nr. 3366 - http://pl.spoj.com/problems/SUDOKUC/
*/

import java.util.*;

class Sudoku{
    Scanner in;
    int [][] game;

    Sudoku(){
        in = new Scanner(System.in);
        game = new int[9][9];
    }

    void putData(int i, int j, int val){
        game[i][j] = val;
    }

    boolean checkRow(){
        for(int i=0; i<9; ++i){
            int [] numbers = new int[9];
            for(int j=0; j<9; ++j){
                if(game[i][j]<1 || game[i][j] > 9){
                    return false;
                }
                numbers[game[i][j]-1]++;
                if(numbers[game[i][j]-1] > 1){
                    return false;
                }
            }
        }
        return true;
    }

    boolean checkColumn(){
        for(int i=0; i<9; ++i){
            int [] numbers = new int[9];
            for(int j=0; j<9; ++j){
                numbers[game[j][i]-1]++;
                if(numbers[game[j][i]-1] > 1){
                    return false;
                }
            }
        }
        return true;
    }

    boolean checkSquares(int x1, int x2, int y1, int y2){
        int [] numbers = new int[9];
        for(int i=y1; i<y2; ++i){
            for(int j=x1; j<x2; ++j){
                numbers[game[i][j]-1]++;
                if(numbers[game[i][j]-1] > 1){
                    return false;
                }
            }
        }
        return true;
    }

    boolean check(){
        if(checkRow()){
            if(checkColumn()){
                if(checkSquares(0,3,0,3) && checkSquares(3,6,0,3) && checkSquares(6,9,0,3)
                        && checkSquares(0,3,3,6) && checkSquares(3,6,3,6) && checkSquares(6,9,3,6)
                        && checkSquares(0,3,6,9) && checkSquares(3,6,6,9) && checkSquares(6,9,6,9)){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        return false;
    }
}

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        int amountOfData = in.nextInt();
        for(int i=0; i<amountOfData; ++i){
            Sudoku sudoku = new Sudoku();
            for(int j=0; j<9; ++j){
                for(int k=0; k<9; ++k){
                    sudoku.putData(j, k, in.nextInt());
                }
            }
            if(sudoku.check()){
                System.out.println("TAK");
            }else{
                System.out.println("NIE");
            }
        }
    }
}
