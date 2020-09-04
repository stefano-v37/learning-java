package com.SVAX29;

public class Tester3 {
    public static void main (String args[]){
        Dog2 dogA = new Dog2("Mucky", "Brown", 30, 3);
        System.out.println(dogA.getNumOfBarks());
        System.out.println(dogA.getColor());

        Cat catA = new Cat("Cappuccino", "White and Brown", 10, 10);
        System.out.println(catA.getNumberOfMeows());
        System.out.println(catA.getName());
    }
}
