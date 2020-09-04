package com.SVAX29;

public class Dog {
    // classes are defined as public so that they can be used by other classes
    // states == instance variables. Convention is they are private
    private String _name;
    private String _color;
    private int _size;

    // constructors go here. Anyway, every java class inherits void constructor from Class class
    public Dog(){
        // every empty constructors instance will have color brown
        _color = "Brown";
    }

    public Dog(String name){
        _name = name;
    }

    public void jump(){}
    public void moveright(){}
    public void moveLeft(){}

    // getters and setters for private variables
    public int getSize(){
        return _size;
    }

    public String getName(){
        return _name;
    }
    public String getColor(){
        return _color;
    }

    public void setSize(int size){
        _size = size;
    }

    public void setName(String name){
        _name = name;
    }

    public void setColor(String color){
        _color = color;
    }

}
