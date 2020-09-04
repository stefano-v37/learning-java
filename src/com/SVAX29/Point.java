package com.SVAX29;

public class Point {
    private double x;
    private double y;

    // constructor
    public Point(){

    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point (Point other){
        this.x = other.x;
        this.x = other.y;
    }

    public double getX(){
        return this.x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY(){
        return this.y;
    }

    public void setY(double y){
        this.y = y;
    }


}
