package com.telusko.innerclass.anonymous;

abstract class A1 {
    public abstract void show();

    public abstract void config();
}

public class AbstractAndAnonymous {
    public static void main(String[] args) {
        A1 obj = new A1() {
            public void show() {
                System.out.println("Hello World");
            }

            public void config() {
                System.out.println("in config");
            }
        };

        obj.show();
        obj.config();
    }
}
