package com.telusko.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreamExample {


public static void main(String[] args) {
     int initialCapacity = 10000;
    List<Integer> nums = new ArrayList<>(initialCapacity);

    Random r = new Random();

    for(int i=1;i<=initialCapacity;i++){
        nums.add(r.nextInt(100));
    }
    // int sum1=nums.stream()
    // .map(n->n*2)
    // .reduce(0,(n1,n2)->n1+n2);


    long startSeq=System.currentTimeMillis();
    int sum2= nums.stream()
                .map(n->{
                    try{
                        Thread.sleep(1);
                    }
                    catch(Exception e){

                    }    
                    return n*2;
                })
                .mapToInt(n->n)
                .sum();
    long endSeq=System.currentTimeMillis();
    System.out.println("Sequential Stream:"+(endSeq-startSeq));
    
    long startPara=System.currentTimeMillis();
    int sum3= nums.parallelStream()
                .map(n->{
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                        
                    }

                    return n*2;})
                .mapToInt(n->n)
                .sum();
     long endPara=System.currentTimeMillis();
    System.out.println("Parallel Stream:"+(endPara-startPara));

    System.out.println(sum2+" "+sum3);

}
}
