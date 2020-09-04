package com.SVAX29;

public class StaticPrac {
    public static void main (String args[]){

        int array[] = {423,54,776,23,545};

        System.out.println(average(array));


        }

    // static method doesn't require to initialize a class to use it
    public static int average(int[] nums){
    int sum=0;
    for (int i=0; i<nums.length; i++){
        sum+=nums[i];
        }
    return sum/nums.length;
    }
}
