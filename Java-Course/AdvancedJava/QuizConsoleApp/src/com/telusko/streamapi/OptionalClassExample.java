package com.telusko.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClassExample {
public static void main(String[] args) {
 
    List<String> names = Arrays.asList("Navin","Lakmi","John");


    String name=names.stream()
    .filter(str->str.contains("x"))
    .findFirst()
    .orElse("Not found");
    

    System.out.println(name);
}
}
