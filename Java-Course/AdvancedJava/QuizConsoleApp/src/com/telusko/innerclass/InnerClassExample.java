package com.telusko.innerclass;

class A {

    int age;

    public void show() {
        System.out.println("In show from A");

    }

    class B {

        public void config() {
            System.out.println("in config From B");
        }

    }

    static class C {
        public void config() {
            System.out.println("In static inner class C");
        }
    }
}

public class InnerClassExample {
    public static void main(String[] args) {
        // normal class
        A objA = new A();
        objA.show();

        // normal inner class
        A.B objB = new A().new B();
        objB.config();

        // static inner class
        A.C objC = new A.C();
        objC.config();
    }
}
