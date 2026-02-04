package com.telusko.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
public static void main(String[] args) {
     //can have duplicate values
    //does maintain order


    List<Integer> nums = new ArrayList<Integer>();

    nums.add(1);
    nums.add(2);
    nums.add(3);
    
    for(Integer n:nums){
        System.out.println(n);
    }
    System.out.println(nums.get(2));
    System.out.println("Index of 1:"+nums.indexOf(1));


    

}
}
