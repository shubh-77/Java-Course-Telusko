package com.telusko.innerclass.anonymous;

class A {
    public void show() {
        System.out.println("In show");
    }
}

public class AnonymousInnerClassExample {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("In new show");
            }
        };
        obj.show();
    }
}
