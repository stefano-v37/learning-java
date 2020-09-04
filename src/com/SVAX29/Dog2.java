package com.SVAX29;

public class Dog2 extends Animal {
    private int _numberOfBarks;

    public Dog2 (){

    }

    public Dog2 (String name, String color, int size, int numOfBarks){
        // puts the variables on the above constructor
        super(name, color, size);
        _numberOfBarks = numOfBarks;
    }

    public void setNumOfBarks(int numOfBarks){
        _numberOfBarks = numOfBarks;
    }

    public int getNumOfBarks(){
        return _numberOfBarks;
    }
}
