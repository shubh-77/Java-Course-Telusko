package com.telusko.exceptions;




public class ExceptionHandlingUsingTryCatch {
public static void main(String[] args) {

        int i =0;
        
        int j =0;
    
        try{
            j =28/i;
        }
        
        
        catch(Exception e){
            System.out.println("Something Went Wrong. "+e);
        }



        
        System.out.println(j);


        System.out.println("Bye");

    }
}
