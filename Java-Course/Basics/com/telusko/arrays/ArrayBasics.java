package com.telusko.arrays;

import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        

        int nums[]=new int[4];
        nums[0]=4;
        nums[1]=6;
        nums[2]=3;
        nums[3]=9;

        for(int i= 0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        System.out.println(Arrays.toString(nums));

        }    
}
