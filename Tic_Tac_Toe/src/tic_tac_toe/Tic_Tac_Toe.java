/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic_tac_toe;

import java.util.Scanner;

/**
 *
 * @author spikal
 */
public class Tic_Tac_Toe {

    /**
     * @param args the command line arguments
     */
    //______________________________________________________________________________________________________________________________________________
    public static void BasicDiag(String x1, String x2, String x3, String x4, String x5, String x6, String x7, String x8, String x9) {

        System.out.println(x1 + "  | " + x2 + " | " + x3);
        System.out.println("---|---|---");
        System.out.println(x4 + "  | " + x5 + " | " + x6);
        System.out.println("---|---|---");
        System.out.println(x7 + "  | " + x8 + " | " + x9);
    }

    //______________________________________________________________________________________________________________________________________________
    public static boolean checkIfWin(boolean alive, String x1, String x2, String x3, String x4, String x5, String x6, String x7, String x8, String x9) {

        if (x1 == x2 && x2 == x3) {
            return (false);
        } else if (x1 == x4 && x4 == x7) {
            return (false);
        } else if (x7 == x8 && x8 == x9) {
            return (false);
        } else if (x1 == x5 && x5 == x9) {
            return (false);
        } else if (x7 == x5 && x5 == x3) {
            return (false);
        } else if (x3 == x6 && x6 == x9) {
            return (false);
        } else if (x4 == x5 && x5 == x6) {
            return (false);
        } else {
            return (true);
        }

    }
    //______________________________________________________________________________________________________________________________________________      

    public static void main(String[] args) {
        // TODO code application logic here
        String x1 = "1";
        String x2 = "2";
        String x3 = "3";
        String x4 = "4";
        String x5 = "5";
        String x6 = "6";
        String x7 = "7";
        String x8 = "8";
        String x9 = "9";
        System.out.println("Welcome to Tic Tac Toe");
        // int move=1;
        boolean wrong = true;
        boolean alive = true;
        int player1 = 0;
        int player2 = 0;

        //player1=playerCheck(player1,wrong);
        Scanner sc = new Scanner(System.in);
        System.out.println("player 1 is playing as: x");
        System.out.println("player 2 is playing as: o");
        BasicDiag(x1, x2, x3, x4, x5, x6, x7, x8, x9);

        boolean game = true;

        while (alive) {

//            System.out.println("player 1 choose a number:");
//                player1= sc.nextInt();
            // alive=checkIfWin(alive,x1,x2,x3,x4,x5,x6,x7,x8,x9);
            alive = checkIfWin(alive, x1, x2, x3, x4, x5, x6, x7, x8, x9);
            //BasicDiag(x1,x2,x3,x4,x5,x6,x7,x8,x9);
            if (checkIfWin(alive, x1, x2, x3, x4, x5, x6, x7, x8, x9) && alive) {
                System.out.println("player 1 choose a number:");
                player1 = sc.nextInt();

                if (player1 == 1) {
                    x1 = "X";
                    BasicDiag(x1, x2, x3, x4, x5, x6, x7, x8, x9);
                } else if (player1 == 2) {
                    x2 = "X";
                    BasicDiag(x1, x2, x3, x4, x5, x6, x7, x8, x9);
                } else if (player1 == 3) {
                    x3 = "X";
                    BasicDiag(x1, x2, x3, x4, x5, x6, x7, x8, x9);
                } else if (player1 == 4) {
                    x4 = "X";
                    BasicDiag(x1, x2, x3, x4, x5, x6, x7, x8, x9);
                } else if (player1 == 5) {
                    x5 = "X";
                    BasicDiag(x1, x2, x3, x4, x5, x6, x7, x8, x9);
                } else if (player1 == 6) {
                    x6 = "X";
                    BasicDiag(x1, x2, x3, x4, x5, x6, x7, x8, x9);
                } else if (player1 == 7) {
                    x7 = "X";
                    BasicDiag(x1, x2, x3, x4, x5, x6, x7, x8, x9);
                } else if (player1 == 8) {
                    x8 = "X";
                    BasicDiag(x1, x2, x3, x4, x5, x6, x7, x8, x9);
                } else if (player1 == 9) {
                    x9 = "X";
                    BasicDiag(x1, x2, x3, x4, x5, x6, x7, x8, x9);
                }

            } else {
                System.out.println("player 2 won!!");
                alive = false;
                BasicDiag(x1, x2, x3, x4, x5, x6, x7, x8, x9);

            }

            alive = checkIfWin(alive, x1, x2, x3, x4, x5, x6, x7, x8, x9);

            if (checkIfWin(alive, x1, x2, x3, x4, x5, x6, x7, x8, x9)) {
                System.out.println("player 2 choose a number:");
                player2 = sc.nextInt();

                if (player2 == 1) {
                    x1 = "O";
                    BasicDiag(x1, x2, x3, x4, x5, x6, x7, x8, x9);
                } else if (player2 == 2) {
                    x2 = "O";
                    BasicDiag(x1, x2, x3, x4, x5, x6, x7, x8, x9);
                } else if (player2 == 3) {
                    x3 = "O";
                } else if (player2 == 4) {
                    x4 = "O";
                    BasicDiag(x1, x2, x3, x4, x5, x6, x7, x8, x9);
                } else if (player2 == 5) {
                    x5 = "O";
                    BasicDiag(x1, x2, x3, x4, x5, x6, x7, x8, x9);
                } else if (player2 == 6) {
                    x6 = "O";
                    BasicDiag(x1, x2, x3, x4, x5, x6, x7, x8, x9);
                } else if (player2 == 7) {
                    x7 = "O";
                    BasicDiag(x1, x2, x3, x4, x5, x6, x7, x8, x9);
                } else if (player2 == 8) {
                    x8 = "O";
                    BasicDiag(x1, x2, x3, x4, x5, x6, x7, x8, x9);
                } else if (player2 == 9) {
                    x9 = "O";
                    BasicDiag(x1, x2, x3, x4, x5, x6, x7, x8, x9);
                }
            } else if (alive && !game) {
                System.out.println("player 1 won!!!");
                alive = false;

            }

            //BasicDiag(x1,x2,x3,x4,x5,x6,x7,x8,x9);
        }

    }
}
