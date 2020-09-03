package com.SVAX29;
import java.util.Scanner;

public class Tester {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a 3 digits number");
        int y = scan.nextInt();
        Variables3 v = new Variables3 ();

        System.out.println(v.reverse(y));
    }
}
