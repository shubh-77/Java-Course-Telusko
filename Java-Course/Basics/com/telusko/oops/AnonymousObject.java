package com.telusko.oops;

class A{
    public A(){
        System.out.println("object created");
    }
    public void show(){
        System.out.println("In A show");
    }
}


public class AnonymousObject {
    public static void main(String[] args) {
        
        // A obj = new A();//refrence variable = Actual object
        // obj.show();

        new A().show();;
        
    }
}
