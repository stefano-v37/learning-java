package com.SVAX29;

public class Strings {
    public static void main (String args[]) {
        String str = "Hello";

        int len = str.length();

        System.out.println(len);

        String temp = str.substring(1, 3);

        System.out.println(temp);

        System.out.println(str.charAt(0));

        str += " World!";

        System.out.println(str);

        System.out.println(str.length());

        System.out.println(str.charAt(10));
        System.out.println(reverse(str));

    }

    public static String reverse (String str){
        String reversed_string = "";
        for(int i = 0; i < str.length(); i++){
            reversed_string += str.charAt(str.length()-1-i);
        }

        return reversed_string;
    }

}
