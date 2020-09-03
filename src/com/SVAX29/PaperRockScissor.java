package com.SVAX29;

import java.util.Scanner;

public class PaperRockScissor {
    public static void main (String args[]){
        int randNum = (int) (Math.random()*3)+1;
//        System.out.println(randNum);
        System.out.println("Choose from the following:\n<1> Scissors\n<2> Paper \n<3> Rock");
        Scanner scan = new Scanner (System.in);
        int choiche = scan.nextInt();

        if (choiche == 1){
            if (randNum == 1){
                System.out.println("Draw!");
            }
            else if (randNum == 2){
                System.out.println("You won!");
            }
            else if (randNum == 3){
                System.out.println("You lost!");
            }
        }

        else if (choiche == 2){
            if (randNum == 1){
                System.out.println("You lost!");
            }
            else if (randNum == 2){
                System.out.println("Draw!");
            }
            else if (randNum == 3){
                System.out.println("You won!");
            }
        }

        else if (choiche == 3){
            if (randNum == 1){
                System.out.println("You won!");
            }
            else if (randNum == 2){
                System.out.println("You lost!");
            }
            else if (randNum == 3){
                System.out.println("Draw!");
            }
        }
        else{
            System.out.println("Invalid choice");
        }
    }
}
