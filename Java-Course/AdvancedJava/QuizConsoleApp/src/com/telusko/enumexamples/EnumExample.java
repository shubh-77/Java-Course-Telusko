package com.telusko.enumexamples;


enum Status{
    Running,
    Failed,
    Pending,
    Success
}


public class EnumExample {
public static void main(String[] args) {
    Status s = Status.Running;
    System.out.println(s);

    System.out.println(s.ordinal());//prints the index of Running status which is 0

    Status [] statusArr=Status.values();

    for(Status status:statusArr){
        System.out.println(status);
    }

}
}
