package com.SVAX29;

public class Cat extends Animal {
    private int _numberOfMeows;

    public Cat () {

    }

    public Cat(String name, String color, int size, int numOfMeows){
        super(name, color, size);
        _numberOfMeows = numOfMeows;
    }

    public void setNumberOfMeows(int numOfMeows){
        _numberOfMeows = numOfMeows;
    }

    public int getNumberOfMeows(){
        return _numberOfMeows;
    }
}
