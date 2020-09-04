package com.SVAX29;

public class Test6 {
    public static void main(String[] args){
        Point pA = new Point(2.0,3.0);
        Point pB = new Point(2.0,7.0);
        Point pC = new Point(7.0,4.0);

        Triangle tria = new Triangle(pA, pB, pC);

        System.out.println(tria.getA());
        // object = other object -> they are linked to same memory access, modifications are spread to both
        Point somePoint = tria.getA();
        System.out.println(somePoint);
        somePoint.setX(200);
        System.out.println(tria.getA().getX());

        // after putting new in get methods the aliasing is no more happening
        System.out.println(somePoint.getX());

    }
}
