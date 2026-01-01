package com.telusko;



public class LiteralsExample {
    public static void main(String[] args) {
       
       int num1=0b101;//binary literal for 5
       System.out.println("Binary Number: "+num1);

       int num2=0xA;//hexadecimal literal for 10
    System.out.println("Hexadecimal Number: "+num2);


        int num3 =10_00_00_000;
        System.out.println("Num with uderscores: "+num3);

        double num4 =12e10;
        System.out.println("Big Number:"+num4);

        char ch='a';
        ch++;
        System.out.println("Character: "+ch);




    }
}