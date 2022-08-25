package com.company;

public class Board {
    static int wrongAnswers;


    public static void printBoard() {
        if (wrongAnswers == 1) {//1 mistake
            System.out.println(" +---+");
            System.out.println(" |    |");
            System.out.println(" O    |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("========");
        } else if (wrongAnswers == 2) {//2 mistakes
            System.out.println(" +---+");
            System.out.println(" |    |");
            System.out.println(" O    |");
            System.out.println(" |    |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("========");
        } else if (wrongAnswers == 3) {//3 mistakes
            System.out.println(" +---+");
            System.out.println(" |    |");
            System.out.println(" O    |");
            System.out.println("-|    |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("========");

        } else if (wrongAnswers == 4) {//4 mistakes
            System.out.println(" +---+");
            System.out.println(" |    |");
            System.out.println(" O    |");
            System.out.println("-|-   |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("========");

            ;
        } else if (wrongAnswers == 5) {//5 mistakes
            System.out.println(" +---+");
            System.out.println(" |    |");
            System.out.println(" O    |");
            System.out.println("-|-   |");
            System.out.println("|     |");
            System.out.println("      |");
            System.out.println("========");

        } else if (wrongAnswers == 6) {//6 mistakes
            System.out.println(" +---+");
            System.out.println(" |    |");
            System.out.println(" O    |");
            System.out.println("-|-   |");
            System.out.println("| |   |");
            System.out.println("      |");
            System.out.println("========");

        }
    }
}
