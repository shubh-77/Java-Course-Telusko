package com.telusko.exceptions;

import java.util.Scanner;

public class TryWithResourcesExample {

    public static void main(String[] args) {
    
        int i=0;
        int j=0;



      


        try( Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number greater  to get exception");
            j=sc.nextInt();
            j=j/i;
            System.out.println(j);
        }



        // try{
        //     j=sc.nextInt();
        //     j=j/i;
    
        // }

        // // catch(Exception e){
        // //     System.out.println(e.toString());

        // // }
        // finally{
        //     //finally block is used to closed the resource
        //     sc.close();
        //     System.out.println("Closing scanner obj");
        // }

        

    }
}
