package com.telusko.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MethodReferencesExample {
public static void main(String[] args) {
        List<String> names = Arrays.asList("Navin","Harsh","John");


        //in uppercase
       List<String> modifyList = names.stream()
        .map(String::toUpperCase)
        .toList();

        System.out.println(modifyList);


        names.stream()
        .map(String::toLowerCase)
        .forEach(System.out::println);
}
}
