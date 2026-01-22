package com.telusko.interfaces;


// class -> class = extends
// class -> interface = implements
// interface -> interface = extends

interface A{
    //Variable are final and static
    int age =44;
    String area="Mumbai";

    //Methods are public and abstract
    void show();
    void config();  
}

interface X{
    void run();
}

interface Y extends X{

}

class B implements A,Y{
    public void show(){
        System.out.println("In show of B");
    }
    public void config(){
        System.out.println("In config of B");
    }
    @Override
    public void run() {      
        System.out.println("in run method");
    }
}

public class InterfaceExample {
public static void main(String[] args) {
    
    A obj = new B();
    System.out.println(A.age);
    System.out.println(A.area);
    obj.show();
    obj.config();

    X obj1 = new B();
    obj1.run();


    // B bObj = new B();
    // bObj.show();
    // bObj.config();
    // bObj.run();
    
    

}
}
