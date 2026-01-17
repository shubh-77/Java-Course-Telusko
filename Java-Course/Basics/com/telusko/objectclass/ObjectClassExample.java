package com.telusko.objectclass;


class Laptop{

     String model;
     int price;
     String serial;

    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }



     @Override
     public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
     }



    public String toString(){
        return String.format("Model: %s, Price: %d",model,price);
    }
}


public class ObjectClassExample {
    public static void main(String[] args) {
        
        Laptop l1 = new Laptop();
        l1.model="Yoga";
        l1.price=90000;
        System.out.println(l1.toString());
    
        Laptop l2 = new Laptop();
        l2.model="Yoga";
        l2.price=90000;

        //by default it comapre 2 objects .by their hexadecimal number
        System.out.println(l1.equals(l2));
    }   
}
