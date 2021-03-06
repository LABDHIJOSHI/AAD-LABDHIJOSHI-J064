package com.mpstme;

public class Assignment2_String_1_LowerUpper {

    public static void main(String[] args) {
        String a = "This is the String";
        StringBuffer newStr = new StringBuffer(a);


        for (int i = 0; i < a.length(); i++){
            if (Character.isLowerCase(a.charAt(i))){
                newStr.setCharAt(i, Character.toUpperCase(a.charAt(i))); // when letter is lowercase, convert it to uppercase letter
            }

            else if(Character.isUpperCase(a.charAt(i))){
                newStr.setCharAt(i, Character.toLowerCase(a.charAt(i))); // when letter is uppercase, convert it to lowercase letter
            }
        }

        System.out.println("The string after conversion is " + newStr + " .");

    }
}
