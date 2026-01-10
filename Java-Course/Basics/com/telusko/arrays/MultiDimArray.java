package com.telusko.arrays;

import java.util.Arrays;

public class MultiDimArray {
    public static void main(String[] args) {
        
       
        int num[][]=new int[3][4];
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                num[i][j]=(int) (Math.random()*100);
            }
        }

       for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Iterating using enhanced for loop");
        //iterating using enachanced for loop
        for(int arr[]:num){
            for(int i:arr){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        
    }
}
