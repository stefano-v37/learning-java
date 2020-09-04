package com.SVAX29;

public class Tester4 {
    public static void main(String args[]){
        Animal array [] = new Animal[4];
        array[0] = new Dog2();
        array[1] = new Cat();

        array[0].jump();
        array[1].jump();

        array[0].setSize(20);
        System.out.println(array[0].getSize());

        Cat cats [] = new Cat [4];
        for (int i=0; i<cats.length; i++){
            cats[i] = new Cat();
        }
        // before initialization cats were pointing to null
        System.out.println(cats);
    }
}
