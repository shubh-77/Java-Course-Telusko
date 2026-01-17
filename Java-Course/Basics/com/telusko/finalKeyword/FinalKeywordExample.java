package com.telusko.finalKeyword;

//final can be used with variable, method and class


/*final*/ class A{

    /*final*/ public void show(){
        System.out.println("Show in A");
    }
}

class B extends A{
    @Override
     public void show(){
        //no one can override final method
        System.out.println("Show in B");
    }
}

public class FinalKeywordExample {
    public static void main(String[] args) {
        
       final String PAN="EHPPP1234H"; // final variable cannot change value
        System.out.println("PAN: " + PAN);

        A obj = new A();
        obj.show(); // method overriding works fine

        obj = new B();// no one can inherit from final class A
        obj.show();




    }
}
