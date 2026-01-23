package com.telusko.enumexamples;


enum Laptop{
    Macbook(2000),XPS(2200),Surface,ThinkPad(1800);

    private int price;

    
    //They have private constructor
    private Laptop() {
        this(500);
        System.out.println("In default Constructor");

    }

    private Laptop(int price) {
        this.price = price;
        System.out.println("In param Constructor");
    }

    //They have public methods
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}

public class EnumExample3 {
public static void main(String[] args) {
    

    // Laptop l = Laptop.XPS;

    // System.out.println(l.name()+" "+l.getPrice());

    // System.out.println(l.ordinal());


    Laptop laptopArray[] = Laptop.values();
    for(Laptop lap:laptopArray){
        System.out.println(lap+" "+lap.getPrice());
    }
    


}
}
