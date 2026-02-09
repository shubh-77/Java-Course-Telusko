package com.shubham.streamapi.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
class Employee{
    private int id;
    private String name;
    private String department;

    private double salary;

    public Employee(int id, String name,String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
    }

   


    
    
}




public class IntermediateExample1 {


private static Map<Integer, List<String>> collect2;

public static void main(String[] args) {
    
    Map<Boolean, List<Integer>> collect;

    List<Employee> employees = Arrays.asList(
        new Employee(1, "Alice", "HR",50000),
        new Employee(2, "Bob", "IT",60000),
        new Employee(3, "Charlie","IT", 55000),
        new Employee(4, "David", "Finance",70000),
        new Employee(5, "Eve","HR", 80000)
    );

    List<Person> persons = Arrays.asList(
        new Person("John", 25),
        new Person("Jane", 30),
        new Person("Jack", 28),
        new Person("Jill", 35)
    );


    //1. sort by salary in descending order
   System.out.println(employees.stream()
    .sorted((e1,e2)->Double.compare(e2.getSalary(),e1.getSalary()))
    .toList());



    //for average always use mapToInt first
    //2. calculate average age of a list of Person objects using java stream.
    System.out.println("Person average age:"+persons.stream()
    .mapToInt(p->p.getAge())
    .average()
    .orElse(0));

    //Partition numbers in even and odd list

    List<Integer> listOfInteger = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    collect = listOfInteger.stream().collect(Collectors.partitioningBy(n->n%2==0));

    System.out.println("Even Numbers: "+collect.get(true));
    System.out.println("Odd Numbers: "+collect.get(false));

    //Group a list of words by their length using Streams
    List<String> listOfWords = Arrays.asList("hi","bi","two","two","foo","four","four","five","apple");
    collect2 = listOfWords.stream().collect(Collectors.groupingBy(String::length));
    System.out.println(collect2);


    //Count occurance of each element in a list

    listOfWords.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));


    //group employees by department and calculate average salary

    System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary))));


}
}
