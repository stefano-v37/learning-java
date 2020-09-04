package com.SVAX29;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    // constructor
    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA(){
        return new Point(a);
    }

    public void setA(Point a){
        this.a = a;
    }

    public Point getB(){
        return new Point(b);
    }

    public void setB(Point b){
        this.b = b;
    }

    public Point getC(){
        return new Point(c);
    }

    public void setC(Point c){
        this.c = c;
    }
}
