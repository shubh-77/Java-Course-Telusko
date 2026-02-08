package com.shubham.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EasySetTwo {
public static void main(String[] args) {
 
    
    List<Integer> numbers = Arrays.asList(8,5,10,15,23,15,20,25,-1,-2);

    List<String> listOfStrings = Arrays.asList("Drake","Array","Apple","Maple","Kalpesh");

    //print distinct
    System.out.println(numbers.stream().distinct().toList());
    System.out.println(numbers.stream().collect(Collectors.toSet()));

    //print avg
    int sum = numbers.stream().reduce(0,(n1,n2)->n1+n2) ;
    int count=(int)numbers.stream().count();
    System.out.println(sum/count);

    System.out.println(numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0));

    //print in ascending and descending order
    System.out.println(numbers.stream().distinct().sorted().toList());
    System.out.println(numbers.stream().distinct().sorted((a,b)->Integer.compare(b, a)).toList());

    //count all string starting with "A"
    System.out.println(listOfStrings.stream().filter(str->str.startsWith("A" )).count());


    //join all string in a list single comma-separated string
    System.out.println(listOfStrings.stream().collect(Collectors.joining(",","{","}")));

    //check if element are positive
    System.out.println(numbers.stream().allMatch(n->n>0));

    //check if any number is divisble by 3
    System.out.println(numbers.stream().anyMatch(n->n%3==0));


    //flatten a list of lists of integers into a single list of integers
    List<List<Integer>> listOfLists = Arrays.asList(
        Arrays.asList(1, 2, 3),
        Arrays.asList(4, 5),
        Arrays.asList(6, 7, 8, 9)
    );
    System.out.println( listOfLists.stream()
        .flatMap(List::stream)
        .toList());
      
            //Find out 1st non empty string
        listOfStrings = Arrays.asList("","","Drake","Array","Apple","Maple","Kalpesh");

        System.out.println(listOfStrings.stream().filter(n->!n.isEmpty()).findFirst().orElse("No String found"));

        //Find 2nd largest number in a list
    System.out.println(numbers.stream().sorted((a,b)->Integer.compare(b,a)).skip(1).findFirst().orElse(-1));





}
}
