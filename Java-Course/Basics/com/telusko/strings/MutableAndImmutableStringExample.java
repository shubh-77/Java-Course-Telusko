package com.telusko.strings;

public class MutableAndImmutableStringExample {
    public static void main(String[] args) {
     
        String name="navin";
         name+=" reddy"; //immutable so changes the reference not the original value
         
        System.out.println("hello "+name);

        String s1="Navin";
        String s2="Navin";
        System.out.println(s1==s2);//compares refrence so true


    }
}
