package com.SVAX29;

import java.util.Scanner;

public class Practice {
    public static void main (String args[]){
        System.out.println("Type the topping you would like on your pizza:");

        Scanner scan = new Scanner(System.in);
        String top = scan.nextLine();

        if(top.equals("Tuna")){
            System.out.println("Great! You chose: " + top);
        }
        else if (top.equals("Corn")){
            System.out.println("Great! You chose: " + top);
        }
        else if (top.equals("Onion")){
            System.out.println("We roun out of " + top + " unfortunately");
        }
        else {
            System.out.println("You can't put " + top + " on our pizza..");
        }
    }
}
