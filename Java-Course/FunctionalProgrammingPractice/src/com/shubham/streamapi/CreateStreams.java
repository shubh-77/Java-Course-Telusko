package com.shubham.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreams {
public static void main(String[] args) {
    

   List<String> names = Arrays.asList("Shubham","Rohit","Ankit"); 

    // 1. convert list to stream
    Stream<String> stream =names.stream();

    System.out.println(stream);

    //arrays to stream
    String[] arr ={"Shubham","Rohit","Ankit"};
    System.out.println(Arrays.stream(arr));

    //strea, .of
   Stream<Integer> myStream= Stream.of(1,2,3);

    //stream genrate
   Stream<Double> limit = Stream.generate(Math::random).limit(5);



}
}
