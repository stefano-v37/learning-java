package com.SVAX29;

public class Checkers {
    public static void main(String args[]) {
        Checkers ob = new Checkers();
        char [][] checkers = ob.boardMaker(2,3);

        for (int i = 0; i < checkers.length; i++) {
            for (int j = 0; j < checkers[i].length; j++) {
                System.out.print(checkers[i][j]);
            }
            System.out.println("\n");
        }
    }

    public char[][] boardMaker(int sizex, int sizey) {
        char checkers[][] = new char[sizey][sizex];
        char sign;

        for (int i = 0; i < checkers.length; i++) {
            if (i % 2 == 0) {
                sign = 'X';
            } else {
                sign = 'O';
            }
            for (int j = 0; j < checkers[i].length; j++) {
                checkers[i][j] = sign;
                if (sign == 'X') {
                    sign = 'O';
                } else {
                    sign = 'X';
                }
            }
        }
        return checkers;
    }
}
