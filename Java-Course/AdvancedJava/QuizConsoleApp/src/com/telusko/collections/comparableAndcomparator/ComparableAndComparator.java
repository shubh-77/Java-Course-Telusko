package com.telusko.collections.comparableAndcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Student implements Comparable<Student>{
    int age;
    String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    @Override
    public int compareTo(Student that) {
        // TODO Auto-generated method stub
        

        return Integer.compare(that.age,this.age);
    }
    

    
}
class StringComparator implements Comparator<String>{
    public int compare(String i1,String i2){

        if(i2.length()>i1.length()){
            return 1;
        }
        else{
            return -1;
        }
    }
}
class MyComparator implements Comparator<Integer>{
    public int compare(Integer i1,Integer i2){
        if(i1%10 >i2%10){
            return 1;
        }else{
            return -1;
        }
    }
}


class StudentComparator implements Comparator<Student>{
    public int compare(Student i1,Student i2){
        if(i1.age >i2.age){
            return 1;
        }else{
            return -1;
        }
    }
}

public class ComparableAndComparator {
public static void main(String[] args) {
    List<Integer> nums = new ArrayList<>();

    // nums.add(43);
    // nums.add(31);
    // nums.add(72);
    // nums.add(29);


    // Collections.sort(nums,new MyComparator());

    // System.out.println(nums);




    // List<String> myString = new ArrayList<>();
    // myString.add("Popepye");
    // myString.add("Peppy");
    // myString.add("Dumy");
    // myString.add("Happy");
    // Collections.sort(myString,new StringComparator());
    // System.out.println(myString);

    List<Student> students= new ArrayList<>();
    students.add(new Student(21,"Navin" ));
    students.add(new Student(12,"John" ));
    students.add(new Student(18,"Parul" ));
         students.add(new Student(20,"Kiran" ));

     Collections.sort(students);    
         for(Student s:students){
            System.out.println(s);
         }




}
}
