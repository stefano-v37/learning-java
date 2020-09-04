package com.SVAX29;

public class Tester2 {
    public static void main (String args[]){
        // main is in another class (convention) because Dog class is our "blueprint"
        Dog dogA = new Dog();
        Dog dogB = new Dog();

        dogA.setName("Muchy");
        dogB.setName("Java");

        System.out.println(dogA.getName());
        System.out.println(dogB.getName());
    }
}
