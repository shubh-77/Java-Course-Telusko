package com.telusko.accesssmodifier.other;

public class A {
    


    private int marks=6;//private can be used in the same class

    int result=0;//default it can be access in same package

    protected int score=8;//protected can be access in same package and in subclass in other package    
     public void show(){
        //public can be used anywhere
        System.out.println("Hello" );
     }


}
