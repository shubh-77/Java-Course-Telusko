package com.shubham.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EasySetOne {
public static void main(String[] args) {
    
    List<Integer> numbers = Arrays.asList(1,2,3,4,5,16,7,8,91,11);

    //print even number list
     System.out.println(numbers.stream().filter(n->n%2==0).collect(Collectors.toList()));

    //print square of numbers in list
     System.out.println(numbers.stream().map(n->n*n).collect(Collectors.toList()));
     
     //Print square of even number list
     System.out.println(numbers.stream().filter(n->n%2==0).map(n->n*n).collect(Collectors.toList()));


    // print first number greater than 10
    System.out.println(numbers.stream().filter(n->n>10)
    .sorted()
    .findFirst().orElse(-1));

    //print count of number greater than 5 in list
    System.out.println(numbers.stream().filter(n->n>5).count());

    //print sum/product of all numbers in list
    System.out.println(numbers.stream().reduce(0,(n1,n2)->n1+n2));
    System.out.println(numbers.stream().reduce(1,(n1,n2)->n1*n2));


    //print sum of even numbers in list
    System.out.println(numbers.stream().filter(n->n%2==0).reduce(0,(n1,n2)->n1+n2));


    //print max number in list
    System.out.println(numbers.stream().max(Integer::compare).orElse(-1));
    System.out.println(numbers.stream().reduce(0, Integer::max));

    //print sum sqauares of even numbers in list
    System.out.println(numbers.stream().filter(n->n%2==0).map(n->n*n).reduce(0,(n1,n2)->n1+n2));

    
}
}
