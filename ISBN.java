package com.LABDHIMPSTME;

import java.util.Scanner;
import java.lang.Math;

public class ISBN {

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        long num,count=0,num1,a=1,sum=0,b=1,rem,num2=0,cond=1,num3;

        System.out.println("Enter a Number: ");
        num= in.nextLong();
        num1=num;
        num3=num;

        //Taking count
        while(num3>0)
        {
            num3=num3/10;
            count++;
        }

        //Loop for sum in ISBN condition
        while (b<=count)
        {
            rem=num1%10;
            num2=rem*b;
            a=1;

            while (a<=1) {
                sum=num2+sum;
                a++;
            }
            num1=num1/10;
            b++;
        }

        //Taking main condition for valid ISBN number
        cond=sum%11;
        if (cond==0) {
            System.out.println("Its an ISBN Number.");
        }

        else{
            System.out.println("Its not an ISBN Number.");
        }
    }
}
