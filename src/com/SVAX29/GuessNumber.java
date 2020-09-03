package com.SVAX29;

import java.util.Scanner;

public class GuessNumber {
    public static void main (String args[]){
        boolean result = false;
        while (result == false) {
            int secretNumber = (int) (Math.random() * 10);
            //        System.out.println(secretNumber);
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();

            if (num == secretNumber) {
                System.out.println("This is the right number!");
                result = true;
            } else {
                System.out.println("Sorry this is not the right number");
            }
        }
    }
}
