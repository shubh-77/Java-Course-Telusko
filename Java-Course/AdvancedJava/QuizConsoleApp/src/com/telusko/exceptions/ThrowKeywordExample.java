package com.telusko.exceptions;





public class ThrowKeywordExample {
public static void main(String[] args) {


    
        int i =20;
        
        int j =0;
    
        try{
            j =18/i;
            if(j==0){
                throw new ArithmeticException("Simple Message from throw keyword");
            }
        }
        
        
        catch(ArithmeticException e){
            //System.out.println("Something Went Wrong. "+e);
            j=18/1;
            System.out.println("Thats the default output"+e.toString());
        }


      
        catch(Exception e){
   
            System.out.println("Something wnt wrong");
        }
        
        System.out.println(j);


        System.out.println("Bye");


}
}
