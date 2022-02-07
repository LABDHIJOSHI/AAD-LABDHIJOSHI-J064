package com.mpstme;

public class Assignment2_String_2_Reverse {
    public static void main(String[] args) {
        String string = "This is the String.";
        //Stores the reverse of given string
        String reversedStr = "";


        //Iterating through the string from last and adding each character
        for(int i = string.length()-1; i >= 0; i--){
            reversedStr = reversedStr + string.charAt(i);
        }

        System.out.println("Original string: " + string);
        //Displays the reverse of given string
        System.out.println("Reverse of given string: " + reversedStr);
    }
}
