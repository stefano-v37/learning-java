package com.SVAX29;

public class Student {

    // instance variables
    private String _name;
    private int _testA;
    private int _testB;
    private int _testC;

    //constructors
    public Student () {

    }

    public Student (String name, int testA, int testB, int testC){
        this._name = name;
        this._testA = testA;
        this._testB = testB;
        this._testC = testC;
    }

    // getters and setters
    public String get_name(){
        return _name;
    }

    public int get_testA(){
        return _testA;
    }

    public int get_testB(){
        return _testB;
    }

    public int get_testC(){
        return _testC;
    }

    public void set_name(String name){
        this._name = name;
    }

    public void set_testA(int testA){
        this._testA = testA;
    }

    public void set_testB(int testB){
        this._testB = testB;
    }

    public void set_testC(int testC){
        this._testC = testC;
    }

    public int testAvg(){
        // I am attaching to THIS object, created on another class
        return (this.get_testA() + this.get_testB() + this.get_testC())/3;
        // Isn't it ok to write this??
        // return (this._testA + this._testB + this._testC)/3;
    }
}
