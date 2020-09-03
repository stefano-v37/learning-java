package com.SVAX29;


public class Variables2 {

    public static void main(String args[]){
        int f=321;

        int lastNum = f%10;
        f = f/10;
        int midNum = f%10;
        f = f/10;
        int firstNum = f%10;

        System.out.println("The reversed number is: " + lastNum + midNum + firstNum);

        int resultNum = lastNum*100;
        resultNum+=midNum*10;
        resultNum+=firstNum;

        System.out.println("The reversed number is: "+resultNum);
    }
}
