package com.SVAX29;

public class ArrayPractice {
    public static void main (String args[]){
        int array [] = {3,4,6,1,8};
        System.out.println(findMax(array));
    }

    public static int findMax (int [] someArray){
        int max = someArray[0];

        for (int i = 1; i<someArray.length; i++) {
            if (someArray[i] > max) {
                max = someArray[i];
            }
        }

        return max;
    }
}
