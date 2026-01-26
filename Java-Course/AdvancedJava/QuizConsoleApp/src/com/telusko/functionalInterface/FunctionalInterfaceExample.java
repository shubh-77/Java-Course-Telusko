package com.telusko.functionalInterface;

@FunctionalInterface
interface A{
    void show(int i,int j);
}






public class FunctionalInterfaceExample {
public static void main(String[] args) {
   //Anonymous Inner Class Implementation
    // A a = new A(){
    //     public void show(){
    //         System.out.println("Hello");
    //     }
    // };
    // a.show();




    //Using Lambda Expression
    A obj = ( i, j) ->{
        System.out.println("Hello "+i+" "+j);
    };
    obj.show(1, 2);








}
}
