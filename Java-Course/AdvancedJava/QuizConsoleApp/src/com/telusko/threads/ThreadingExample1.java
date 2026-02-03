package com.telusko.threads;

class Counter {
    int count;

    public void increment() {
        count++;
    }

}

class A extends Thread {
    Counter c = new Counter();

    public void run() {
        for (int i = 1; i <= 1000; i++) {
            // System.out.println("Hi");
            c.increment();
        }
    }
}

class B extends Thread {
    public void run() {

        Counter c = new Counter();

        for (int i = 1; i < 1000; i++) {
            // System.out.println("Hello");
            c.increment();
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
