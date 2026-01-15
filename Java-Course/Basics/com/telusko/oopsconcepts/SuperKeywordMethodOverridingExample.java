package com.telusko.oopsconcepts;

class A{

// public A(){
//     System.out.println("in A");
// }

//  public A(int n){
//         System.out.println("in A "+n);
//     }

    public void show(){
        System.out.println("in A show");
    }
    public void config(){
        System.out.println("in A config");
    }
}

class B extends A{

    // public B(){
    //     System.out.println("in B");
    // }
    // public B(int n){
    //     //super();// by default it calls default constructor of super class
    //     this();
    //     System.out.println("in B "+n);
    // }

    @Override
    public void show(){
        System.out.println("in B show");
        //same name and same param in method overriding
    }
}


public class SuperKeywordMethodOverridingExample {
    public static void main(String[] args) {
        
        B obj = new B();
        obj.show();
        obj.config();
    }
}
