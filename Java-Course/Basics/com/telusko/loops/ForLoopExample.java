package com.telusko.loops;

public class ForLoopExample {
    public static void main(String[] args) {
        

        // for(int i=0;i<4;i++){
        //     System.out.println("Hello "+i);

        // }

        for(int i=1;i<=5;i++){
            System.out.println("DAY "+i);
            for(int j=1;j<=9;j++){
                System.out.println("  Hour "+(j+8)+" "+(j+9));
            }
        }   
    }
}
