package com.telusko.oopsconcepts;



class Human{

    private int age;
    private String name;


    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
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
        human.setAge(30);
        human.setName("Navin");

        System.out.println(human.getAge()+" "+human.getName());



        
    }
}
