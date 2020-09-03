package com.SVAX29;

public class ArrayPractice {
    public static void main (String args[]){
        int array [] = {3,4,6,40,8,34,5,2};
        System.out.println(findMax(array));
        findMin(array);
        ArrayPractice ob = new ArrayPractice();
        System.out.println(ob.findMax2(array));
        System.out.println(ob.findDifference(array));
        System.out.println(ob.lucky13(array));
        System.out.println(ob.lucky13Match(array));

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

    public static int findMin (int [] someArray){
        int min = someArray[0];

        for (int i = 1; i<someArray.length; i++) {
            if (someArray[i] < min) {
                min = someArray[i];
            }
        }

        return min;
    }

    public int findMin2 (int [] someArray){
        int min = someArray[0];

        for (int i = 1; i<someArray.length; i++) {
            if (someArray[i] < min) {
                min = someArray[i];
            }
        }

        return min;
    }

    public int findMax2 (int [] someArray){
        int max = someArray[0];

        for (int i = 1; i<someArray.length; i++) {
            if (someArray[i] > max) {
                max = someArray[i];
            }
        }

        return max;
    }

    public int findDifference (int [] someArray){
        int maxDiff = findMax(someArray) - findMin(someArray);

        return maxDiff;
    }

    public boolean lucky13(int [] someArray){
        for(int i=0; i<someArray.length; i++){
            if (someArray[i] == 1 || someArray[i] == 3){
                return true;
            }

        }
        return false;
    }

    public boolean lucky13Match(int [] numbers){
        boolean oneFound = false;
        boolean threeFound = false;
        for (int i=0; i<numbers.length;i++){
            if(oneFound && threeFound){
                return true;
            }
            if (numbers[i] == 1){
                oneFound = true;
            }
            else if (numbers[i] == 3){
                threeFound = true;
            }

        }
        return false;
    }
}
