package com.telusko.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
public static void main(String[] args) {
    

    // Set<Integer> hashSet= new HashSet<>();
    // //can have only unique values
    // //does not maintain order

    // hashSet.add(6);

    // hashSet.add(1);
    // hashSet.add(2);
    // hashSet.add(3);
    // hashSet.add(1);
    // hashSet.add(55);
    // hashSet.add(65);

    // for(Integer n:hashSet){
    //     System.out.println(n);
    // }







    Set<Integer> treeSet = new TreeSet<>();
    //Maintains order due to navigational set
    treeSet.add(6);

    treeSet.add(1);
    treeSet.add(2);
    treeSet.add(3);
    treeSet.add(1);
    treeSet.add(55);
    treeSet.add(65);


    // for(Integer n: treeSet){
    //     System.out.println(n);
    // }

    Iterator<Integer> itr= treeSet.iterator();

    while(itr.hasNext()){
        System.out.println(itr.next());
    }


    
}
}
