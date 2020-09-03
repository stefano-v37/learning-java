package com.SVAX29;

import java.util.Scanner;

public class Trivia {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);

        // board
        String triviaBoard [][] = new String [5][3];

        // questions
        triviaBoard[0][0] = "What motorbike do I ride?";
        triviaBoard[1][0] = "What color is SHE?";
        triviaBoard[2][0] = "How old am I?";
        triviaBoard[3][0] = "What is my height (cm)?";
        triviaBoard[4][0] = "What is my weight (kg)?";

        // answers
        triviaBoard[0][1] = "<A>Yamaha XJ6\n<B>Yamaha R1m\n<C>Ducati Monster";
        triviaBoard[1][1] = "<A>Green\n<B>White\n<C>Red";
        triviaBoard[2][1] = "<A>25\n<B>23\n<C>31";
        triviaBoard[3][1] = "<A>170\n<B>183\n<C>191";
        triviaBoard[4][1] = "<A>79\n<B>92\n<C>70";

        // correct-answers
        triviaBoard[0][2] = "A";
        triviaBoard[1][2] = "B";
        triviaBoard[2][2] = "A";
        triviaBoard[3][2] = "B";
        triviaBoard[4][2] = "A";

        // interface
        int money = 0;
        System.out.println("Answer correctly and you gain 5 €, but for every error you lose the same amount.");
        for (int i=0; i<triviaBoard.length; i++){
            System.out.println("Question number "+(i+1)+":");
            System.out.println(triviaBoard[i][0]);
            System.out.println(triviaBoard[i][1]);
            Scanner scanAnswer = new Scanner(System.in);
            String userAnswer = "X";
            boolean flag = false;
            while (flag==false) {
                userAnswer = scanAnswer.next();
                if (userAnswer.equals("A") || userAnswer.equals("B") || userAnswer.equals("C")) {
                    flag = true;
                }
                else {
                    System.out.println("Please select a valid option (A, B or C)");
                }
            }
            if (userAnswer.equals(triviaBoard[i][2])){
                System.out.println("Correct answer! You win 5€");
                money += 5;
            }
            else{
                System.out.println("Wrong answer! You lose 5€");
                money -= 5;
            }
        }
        if (money > 0){
            System.out.println("In the end you win " + money + "€");
        }
        else if (money == 0){
            // Can't happen with odd number of questions
            System.out.println("In the end you do not win anything");
        }
        else if (money < 0){
            System.out.println("I am sorry but you owe me " + money + "€");
        }
    }
}
