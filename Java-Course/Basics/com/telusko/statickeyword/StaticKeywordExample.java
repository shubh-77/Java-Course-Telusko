package com.telusko.statickeyword;

class Mobile{
    String brand;
    int price;
    static String name;

    static {
        System.out.println("In static block ");
        name="SmartPhone";
    }

    public void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Name: " + name);
    }


    //static method
    public static void display(Mobile obj) {
            System.out.println("from static method");
            //can use static variable but not not non static variable
            System.out.println("Mobile Name: " + name);

        //Hacky way
        System.out.println("Brand: " + obj.brand);
        System.out.println("Price: " + obj.price);
        System.out.println("Name: " + obj.name);
    }
}





public class StaticKeywordExample {
    public static void main(String[] args) {

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price=1500;        
                
        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price=1700;


        obj1.showDetails();
        System.out.println();
        obj2.showDetails();

        Mobile.display(obj1);

    }
}
