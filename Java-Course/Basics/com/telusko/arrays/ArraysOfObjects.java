package com.telusko.arrays;



class Student{
    int rollno;
    String name;
    int marks;




}
public class ArraysOfObjects {
    public static void main(String[] args) {
        
        Student s1 = new Student();

        s1.rollno=1;
        s1.name="Navin";
        s1.marks=88;
        Student s2 = new Student();

         s2.rollno=2;
        s2.name="Avi";
        s2.marks=80;

        Student[] sArray= new Student[2];

        sArray[0]=s1;
        sArray[1]=s2;
        
        //for each loop or enhanced for loop
        for(Student s :sArray){
            System.out.println(s.rollno+" "+s.name+" "+s.marks);
        }

    }
}
