package com.SVAX29;

public class MultiDimensionalArray {
    public static void main (String args[]){
        int mdArray [] [] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        for (int i=0; i<mdArray.length; i++){
            for (int j = 0; j<mdArray[i].length; j++){
                System.out.print(mdArray[i][j] + " ");
            }
        }
    }
}
