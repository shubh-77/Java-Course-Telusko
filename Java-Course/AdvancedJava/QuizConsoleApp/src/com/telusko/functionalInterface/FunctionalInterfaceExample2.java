package com.telusko.functionalInterface;

@FunctionalInterface
interface A1{

    int add(int i,int j);

}



public class FunctionalInterfaceExample2 {
public static void main(String[] args) {
    
    //Using anonymous class 

    // A1 obj = new A1(){


    //     public int add(int i,int j){
    //         return i+j;
    //     }
    // };

    // System.out.println(obj.add(1, 2));


    A1 obj = (i,j)->{
        return i+j;
    };

    System.out.println(obj.add(1, 2));
}
}
