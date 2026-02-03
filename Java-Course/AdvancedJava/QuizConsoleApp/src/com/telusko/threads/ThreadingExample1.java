package com.telusko.threads;


class A extends Thread{
    public void run(){
        for(int i=1;i<=1000;i++){
            System.out.println("Hi");
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=1;i<1000;i++){
            System.out.println("Hello");
        }
    }
}


public class ThreadingExample1 {
public static void main(String[] args) {
    // A obj = new A();
    // B obj1 = new B();

    // obj.show();
    // obj1.show();



    A obj = new A();
    obj.start();
    B obj1 = new B();
    obj1.start();
}
}
