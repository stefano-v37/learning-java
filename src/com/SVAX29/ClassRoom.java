package com.SVAX29;

public class ClassRoom {
    private Student _students [] = new Student [20];
    public ClassRoom() {
        int randA;
        int randB;
        int randC;
        for (int i = 0; i < _students.length; i++) {
            randA = 70 + (int) (Math.random() * ((100 - 70) + 1));
            randB = 70 + (int) (Math.random() * ((100 - 70) + 1));
            randC = 70 + (int) (Math.random() * ((100 - 70) + 1));

            _students[i] = new Student("name", randA, randB, randC);
        }
    }
    public Student[] getStudents(){
        return _students;
    }
}
