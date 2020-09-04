package com.SVAX29;

public class Animal {
    private String _name;
    private String _color;
    private int _size;

    public void jump(){
        System.out.println("The animal jump");
    }
    public void moveright(){}
    public void moveLeft(){}

    // constructors
    public Animal(){
    }

    public Animal(String name, String color, int size){
        _name = name;
        _color = color;
        _size = size;
    }

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
