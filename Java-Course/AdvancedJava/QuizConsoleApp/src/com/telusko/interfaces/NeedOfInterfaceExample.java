package com.telusko.interfaces;

interface Computer{
    void code();
}


class Laptop implements Computer{
    public void code(){
        System.out.println("Code compile and run");
    }
}

class Desktop implements Computer{
     public void code(){
        System.out.println("Code compile and run: faster");
    }
}
class Developer{
    public void devApp(Computer m){
        m.code();
    }
}

public class NeedOfInterfaceExample {
public static void main(String[] args) {

    Computer laptop = new Laptop();
    
    Computer desktop = new Desktop();

    Developer d = new Developer();
    d.devApp(laptop);
}
}
