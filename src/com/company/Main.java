package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    static String [][] board = new String[10][8];
     static Random random = new Random();

    static void printBoard(String[][] board) {
        System.out.println(board);
    }

    static void randomTresure(String[][] board) {
        int x = random.nextInt(10);
        int y = random.nextInt(8);
        int tresureAmount = random.nextInt(100);
        System.out.println("x= "+ x + " y= " + y + " tresureAmount= " + tresureAmount);
        board [x][y] = "[" + Integer.toString(tresureAmount) + "]";
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 8; j++){
                board[i][j] = "[ ]";
                System.out.print(board[i][j]);
            }
            System.out.println("");

        }
        for (int i = 0; i < 10; i++){
            randomTresure(board);
        }
        printBoard(board);





    }
}
