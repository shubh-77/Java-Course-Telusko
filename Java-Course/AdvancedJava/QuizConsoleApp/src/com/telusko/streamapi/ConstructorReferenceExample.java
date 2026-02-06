package com.telusko.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
    private String name;
    private String age;


    
    public Student() {
        super();
    }



    public Student(String name) {
        this.age="0";
        this.name = name;
    }



    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public String getAge() {
        return age;
    }



    public void setAge(String age) {
        this.age = age;
    }



    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }


    
    

    
}
public class ConstructorReferenceExample {
public static void main(String[] args) {
    

    List<String> names = Arrays.asList("Navin","Harsh","John");

    List<Student> students = new ArrayList<>();
    // for(String name:names){

    //     students.add(new Student(name,"20"));
    // }


    students= names.stream()
    .map(Student::new)
    .toList();

    System.out.println(students);

}
}
