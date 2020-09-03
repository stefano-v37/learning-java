package com.SVAX29;

public class Loops {
    public static void main (String args[]){
        int sum=0;
        int i=0; //iterator

        while(i<10){
//            actions for every loop
            sum += 2;
            System.out.println(sum);
            ++i;
        }
        i = 0;
        do{
            sum+=2;
            System.out.println(sum);
            i++;
        }
        while(i<10);

        sum = 0;

        for(int j = 0; j<10; j++){
            sum += 2;
            System.out.println(sum);
        }
    }

}
