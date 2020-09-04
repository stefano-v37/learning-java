package com.SVAX29;

public class Tester5 {
    public static void main(String args[]){
        ClassRoom classA = new ClassRoom();
        for (int i = 0; i < classA.getStudents().length; i++) {
            System.out.println(classA.getStudents()[i].get_testA());
        }

        // if toString method is available the sout will go directly to it when printing the class
        System.out.println(classA.toString());
        System.out.println(classA);
    }
}
