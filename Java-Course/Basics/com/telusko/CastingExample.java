package com.telusko;

public class CastingExample {
    public static void main(String[] args) {
        int a =256;
        byte b =127;
        a=b; //implicit casting or widening or conversion
        System.out.println("Value of a after implicit casting:"+a);

        a=257;
        b=(byte)a; //explicit casting or narrowing or casting
        System.out.println("Value of b after explicit casting:"+b);

        float f =5.6f;
        int x = (int)f;
    
        System.out.println("Float to integer casting:"+x);


        //Type promotion
        byte p=10;
        byte q=20;
        int result=p*q;
        System.out.println("Type promotion in expression result:"+result);

    }
}
