package com.SVAX29;

public class Variables3 {

    int globalV = 4;

    public int reverse(int num) {
        if (num > 99 && num < 1000) {
            int lastNum = num % 10;
            num = num / 10;
            int midNum = num % 10;
            num = num / 10;
            int firstNum = num % 10;

            int result = lastNum * 100 + midNum * 10 + firstNum;

            return result;
        } else {
            System.out.println("You should enter a 3 digits number");
            return 0;
        }
    }
}
