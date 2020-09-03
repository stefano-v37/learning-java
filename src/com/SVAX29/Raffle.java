package com.SVAX29;

import java.util.Scanner;

public class Raffle {
    public static void main (String args[]){
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter a number of people");

        int numOfFriends = scan.nextInt();

        String friends [] = new String [numOfFriends];

        System.out.println("Enter their names:");

        for (int i = 0; i<numOfFriends; i++) {
            String newFriend = scan.next();
            friends[i] = newFriend;
        }

        int rand = (int) (Math.random() * numOfFriends);

        System.out.println(rand);

        System.out.println("The winner is: " + friends[rand]);
    }
}
