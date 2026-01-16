package com.telusko.accesssmodifier;

import com.telusko.accesssmodifier.other.A;


class C extends A{
    void display(){
        System.out.println(score);
    }
}


public class AccessModifierExample {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        B obj2 = new B();
        System.out.println(obj2.marks);

    }
}
