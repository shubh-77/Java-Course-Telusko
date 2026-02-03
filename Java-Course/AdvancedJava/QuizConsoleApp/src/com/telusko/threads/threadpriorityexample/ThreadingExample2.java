package com.telusko.threads.threadpriorityexample;

class A extends Thread {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class ThreadingExample2 {
    public static void main(String[] args) {
        // A obj = new A();
        // B obj1 = new B();

        // obj.show();
        // obj1.show();

        A obj1 = new A();
        B obj2 = new B();
        obj2.setPriority(10);

        System.out.println(obj1.getPriority());
        obj1.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        obj2.start();

    }
}
