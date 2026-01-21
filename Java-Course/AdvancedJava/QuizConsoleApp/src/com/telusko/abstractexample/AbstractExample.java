package com.telusko.abstractexample;

//Abstract class can have abstract and non-abstract methods
abstract class Car {
    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("Play Music");
    }

}

abstract class WagonR extends Car {

    public void drive() {
        System.out.println("Driving");
    }

}

// concrete class to implment methods
class UpdatedWagonR extends WagonR {

    @Override
    public void fly() {
        System.out.println("Flying WagonR");
    }

}

public class AbstractExample {
    public static void main(String[] args) {
        // We cannot create object of abstract
        // but we can create reference if abstract class

        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.fly();
        obj.playMusic();
    }
}
