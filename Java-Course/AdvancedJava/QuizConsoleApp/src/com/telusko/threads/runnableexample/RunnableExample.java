package com.telusko.threads.runnableexample;

class Z {

}

// class A1 implements Runnable {
// public void run() {
// for (int i = 1; i <= 2; i++) {
// System.out.println("Hi");
// try {
// Thread.sleep(10);
// } catch (InterruptedException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// }
// }
// }
// }

// class B1 implements Runnable {
// public void run() {
// for (int i = 1; i <= 2; i++) {
// System.out.println("Hello");
// try {
// Thread.sleep(10);
// } catch (InterruptedException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// }
// }
// }
// }

public class RunnableExample {
    public static void main(String[] args) {
        // A1 objA = new A1();
        // Runnable objA = new Runnable() {

        // public void run() {
        // for (int i = 1; i <= 2; i++) {
        // System.out.println("Hi");
        // try {
        // Thread.sleep(10);
        // } catch (InterruptedException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
        // }
        // }
        // };
        // Anonymous class using lambda
        Runnable objA = () -> {
            for (int i = 1; i <= 2; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };

        Runnable objB = () -> {
            for (int i = 1; i <= 2; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(objA);
        Thread t2 = new Thread(objB);

        t1.start();
        t2.start();

    }
}
