package com.telusko.arrays;



public class JaggedArray {

    public static void main(String[] args) {
        int nums[][] = new int[3][];
        

        nums[0] = new int [3];
        nums[1]= new int [4];
        nums[2]=new int [2];
        int size=nums.length;
        System.out.println(size);

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){

                nums[i][j]=(int)(Math.random()*100);

            }
            
        }


        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){

                System.out.print(nums[i][j]+" ");

            }
            System.out.println();
            
        }

          System.out.println("Iterating using enhanced for loop");
        //iterating using enachanced for loop
        for(int arr[]:nums){
            for(int i:arr){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        






        
    



    }
}