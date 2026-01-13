package com.telusko.oopsconcepts;



class Human{

    private int age;
    private String name;

    //added default constructor
    public Human() {
        this.age=12;
        this.name="John";
    }

    //added parameterized constructor
    public Human(String name) {
        this.age=12;//assigning default value
        this.name = name;
    }
    //added parameterized constructor
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
     public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class EncapsulationExample {
    public static void main(String[] args) {
        Human human = new Human();
        Human human1 = new Human(18,"Navin");

        System.out.println(human.getAge()+" "+human.getName());
        System.out.println(human1.getAge()+" "+human1.getName());

        human.setAge(30);
        human.setName("Navin");

       // System.out.println(human.getAge()+" "+human.getName());



        
    }
}
