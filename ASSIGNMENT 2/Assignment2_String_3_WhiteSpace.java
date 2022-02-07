package com.mpstme;

public class Assignment2_String_3_WhiteSpace {
    public static void main (String[]args){

        String str = "This  is  the  string";

        str = str.replaceAll("\\s+","");

        System.out.println("string after removing white space " + str);
    }
}


